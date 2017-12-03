package org.fkit.controller;



import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;


/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */


@Controller
public class UserController{
	
	private static final Log logger = LogFactory.getLog(UserController.class);
	 
	@RequestMapping(value="/{formName}")
	 public String loginForm(
			 @PathVariable String formName,
			 Model model){
		User user = new User();
		model.addAttribute("user",user);
		// 动态跳转页面
		return formName;
	}
	 
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(
			 @ModelAttribute @Validated User user,
			 Model model,
			 HttpServletRequest request) {
		 logger.info(user);
		 // 如果登录名是fkit，密码是123456，则验证通过
		 if(user.getLoginname()!=null && user.getLoginname().equals("fkit")
			 && user.getPassword()!=null && user.getPassword().equals("123456")){
			 //从后台代码获取国际化信息username
	         RequestContext requestContext = new RequestContext(request);
	         String username = requestContext.getMessage("username");
	         // 将获取的username信息设置到User对象并设置到Model当中
	         user.setUsername(username);
			 model.addAttribute("user", user);
		     return "success";
		 }
		 return "error";
		
	 }

}

