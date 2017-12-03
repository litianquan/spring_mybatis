package org.fkit.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
// 将Model中的属性名为user的放入HttpSession对象当中
@SessionAttributes("user")
public class SessionAttributesController{

	// 静态的日志类LogFactory
	private static final Log logger = LogFactory
            .getLog(SessionAttributesController.class);
	
	// 该方法映射的请求为http://localhost:8080/DataBindingTest/{formName}
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// 动态跳转页面
		return formName;
	}

	// 该方法映射的请求为http://localhost:8080/DataBindingTest/login
	@RequestMapping(value="/login")
	 public String login(
			 @RequestParam("loginname") String loginname,
			 @RequestParam("password") String password,
			 Model model ) {
		 // 创建User对象，装载用户信息
		 User user = new User();
		 user.setLoginname(loginname);
		 user.setPassword(password);
		 user.setUsername("admin");
		 // 将user对象添加到Model当中
		 model.addAttribute("user",user);
		 return "welcome";
	 }
	
	

}

