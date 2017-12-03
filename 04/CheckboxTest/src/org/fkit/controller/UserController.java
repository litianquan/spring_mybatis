package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	 
	 @RequestMapping(value="/checkboxForm",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 User user = new User();
		 // 设置boolean变量reader的值为true，页面的checkbox复选框会被选中
		 user.setReader(true);
		 // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
		 List<String> list = new ArrayList<String>();
		 list.add("JAVAEE");
		 list.add("Spring");
		 user.setCourses(list);
		 // model中添加属性command，值是user对象
    	 model.addAttribute("user",user);
	     return "checkboxForm";
	 }
	 

}

