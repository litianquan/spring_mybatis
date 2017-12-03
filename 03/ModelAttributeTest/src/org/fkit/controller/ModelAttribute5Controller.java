package org.fkit.controller;

import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class ModelAttribute5Controller{

		// model属性名称就是value值即”user”，model属性对象就是方法的返回值
		@ModelAttribute("user")
		public User userModel5( 
				@RequestParam("loginname") String loginname,
				@RequestParam("password") String password){
			User user = new User();
			user.setLoginname(loginname);
			user.setPassword(password);
			return user;
		}

    	// @ModelAttribute("user") User user注释方法参数，参数user的值来源于userModel5()方法中的model属性。
    	@RequestMapping(value="/login5")
		 public String login5(@ModelAttribute("user") User user) {
			user.setUsername("管理员");
			 return "result5";
		 }
}

