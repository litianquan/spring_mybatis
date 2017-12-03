package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ModelAttribute2Controller{

	// model属性名称和model属性对象由model.addAttribute()实现，前提是要在方法中加入一个Model类型的参数。
	// 注意：当URL或者post中不包含对应的参数时，程序会抛出异常。
	@ModelAttribute
	public void userModel2( 
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			 Model model){
		model.addAttribute("loginname", loginname);
		model.addAttribute("password", password);
	}

	@RequestMapping(value="/login2")
	 public String login2() {
		 return "result2";
	 }

}

