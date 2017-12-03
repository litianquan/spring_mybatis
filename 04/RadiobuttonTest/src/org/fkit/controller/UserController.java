package org.fkit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 
	 @RequestMapping(value="/radiobuttonForm",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 User user = new User();
		 // 设置sex变量的值为男，页面的radio单选框的value=男会被选中
		 user.setSex("男");
		 model.addAttribute("user", user);
	     return "radiobuttonForm";
	 }
	 
	 @RequestMapping(value="/radiobuttonsForm",method=RequestMethod.GET)
	 public String registerForm2(Model model) {
		 User user = new User();
		 // 设置sex变量的值为男，页面的radio单选框的value=男会被选中
		 user.setSex("男");
		// 页面展现的可供选择的单选框内容sexList
		 List<String> sexList = new ArrayList<String>();
		 sexList.add("男");
		 sexList.add("女");
		 model.addAttribute("user", user);
		 model.addAttribute("sexList", sexList);
	     return "radiobuttonsForm";
	 }
	 
	 @RequestMapping(value="/radiobuttonsForm2",method=RequestMethod.GET)
	 public String registerForm3(Model model) {
		 User user = new User();
		 // 设置sex变量的值为"1"，页面的radio单选框的value=男会被选中
		 user.setSex("1");
		// 页面展现的可供选择的单选框内容sexMap
		 Map<String, String> sexMap = new HashMap<String, String>();
		 sexMap.put("1", "男");
		 sexMap.put("2", "女");
		 model.addAttribute("user", user);
		 model.addAttribute("sexMap", sexMap);
	     return "radiobuttonsForm2";
	 }
	 

}

