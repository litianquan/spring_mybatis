package org.fkit.controller;


import org.fkit.domain.User;
import org.fkit.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

/**
 *  HelloWorldController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class UserController{
	 
	 @RequestMapping(value="/registerForm",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 User user = new User();
		 // model中添加属性user，值是user对象
    	 model.addAttribute("user",user);
	     return "registerForm";
	 }
	 
	 @InitBinder  
	 public void initBinder(DataBinder binder) {  
		// 设置验证的类为UserValidator
	    binder.setValidator(new UserValidator());  
	 } 
	 
	 @RequestMapping(value="/register",method=RequestMethod.POST)
	 public String register(@Validated User user, Errors errors) {
		 // 如果Errors对象有Field错误的时候，重新跳回注册页面，否则正常提交
		 if (errors.hasFieldErrors())  
			 return "registerForm";  
	     return "submit"; 
	 }
	 

}

