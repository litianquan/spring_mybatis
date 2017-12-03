package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class User3Controller{
	private static final Log logger = LogFactory.getLog(User3Controller.class);
	
	@ModelAttribute
	public void userMode3(String loginname,String password,
			 ModelAndView mv){
		logger.info("userMode3");
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		// 将User对象添加到ModelAndView的Model当中
		mv.addObject("user", user);
	}
	
	@RequestMapping(value="/login3")
	 public ModelAndView login3(ModelAndView mv){
		logger.info("login3");
		// 从ModelAndView的Model当中取出之前存入的名为user的对象
		User user = (User) mv.getModel().get("user");
		System.out.println(user);
		// 设置user对象的username属性
		user.setUsername("测试");
		// 设置返回的视图名称
		mv.setViewName("result3");
		return mv;
	}
	
	

}

