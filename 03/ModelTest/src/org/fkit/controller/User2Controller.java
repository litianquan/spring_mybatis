package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
public class User2Controller{
	private static final Log logger = LogFactory.getLog(User2Controller.class);
	
	@ModelAttribute
	public void userMode2(String loginname,String password,
			 ModelMap modelMap){
		logger.info("userMode2");
		// 创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		// 将User对象添加到ModelMap当中
		modelMap.addAttribute("user", user);
	}
	
	@RequestMapping(value="/login2")
	 public String login2(ModelMap modelMap){
		logger.info("login2");
		// 从ModelMap当中取出之前存入的名为user的对象
		User user = (User) modelMap.get("user");
		System.out.println(user);
		// 设置user对象的username属性
		user.setUsername("测试");
		return "result2";
	}
	
	

}

