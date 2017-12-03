package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class User1Controller{
	
	private static final Log logger = LogFactory.getLog(User1Controller.class);
	
	// @ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数
	@ModelAttribute
	public void userModel(String loginname,String password,
			 Model model){
		logger.info("userModel");
		// 创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		// 将User对象添加到Model当中
		model.addAttribute("user", user);
	}
	
	@RequestMapping(value="/login1")
	 public String login(Model model){
		logger.info("login");
		// 从Model当中取出之前存入的名为user的对象
		User user = (User) model.asMap().get("user");
		System.out.println(user);
		// 设置user对象的username属性
		user.setUsername("测试");
		return "result1";
	}
	
	

}

