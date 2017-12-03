package org.fkit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fkit.domain.Dept;
import org.fkit.domain.Employee;
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
	 
	 @RequestMapping(value="/checkboxesForm",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 User user = new User();
		 // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
		 List<String> list = new ArrayList<String>();
		 list.add("JAVAEE");
		 list.add("Spring");
		 user.setCourses(list);
		 // 页面展现的可供选择的复选框内容courseList
		 List<String> courseList = new ArrayList<String>();
		 courseList.add("JAVAEE");
		 courseList.add("Mybatis");
		 courseList.add("Spring");
		 // model中添加属性user和courseList
    	 model.addAttribute("user",user);
    	 model.addAttribute("courseList",courseList);
	     return "checkboxesForm";
	 }
	 
	 @RequestMapping(value="/checkboxesForm2",method=RequestMethod.GET)
	 public String registerForm2(Model model) {
		 User user = new User();
		 // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
		 List<String> list = new ArrayList<String>();
		 list.add("1");
		 list.add("3");
		 user.setCourses(list);
		 // 页面展现的可供选择的复选框内容courseList
		 Map<String, String> courseMap = new HashMap<String, String>();
		 courseMap.put("1","JAVAEE");
		 courseMap.put("2","Mybatis");
		 courseMap.put("3","Spring");
		 // model中添加属性user和courseList
    	 model.addAttribute("user",user);
    	 model.addAttribute("courseMap",courseMap);
	     return "checkboxesForm2";
	 }
	 
	 @RequestMapping(value="/checkboxesForm3",method=RequestMethod.GET)
	 public String registerForm3(Model model) {
		 Employee employee = new Employee();
		 Dept dept = new Dept(1,"开发部");
		 // 为集合变量depts添加Dept对象，该对象id=1，name=开发吧，页面的checkbox复选框这一项会被选中
		 List<Dept> list = new ArrayList<Dept>();
		 list.add(dept);
		 employee.setDepts(list);
		 // 页面展现的可供选择的复选框内容deptList
		 List<Dept> deptList = new ArrayList<Dept>();
		 deptList.add(dept);
		 deptList.add(new Dept(2,"销售部"));
		 deptList.add(new Dept(3,"财务部"));
		 // model中添加属性employee和deptList
    	 model.addAttribute("employee",employee);
    	 model.addAttribute("deptList",deptList);
	     return "checkboxesForm3";
	 }
	 

}

