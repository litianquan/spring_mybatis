package org.fkit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fkit.domain.Book;
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

@Controller
public class TestController{
	 
	 @RequestMapping(value="/forEachTest",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 // 页面用于遍历的List集合
		 List<String> courseList = new ArrayList<String>();
		 courseList.add("JAVAEE");
		 courseList.add("Mybatis");
		 courseList.add("Spring");
		 // 页面用于遍历的List集合<Book>
		 List<Book> bookList = new ArrayList<Book>();
		 bookList.add(new Book(1, "疯狂Java讲义", "李刚"));
		 bookList.add(new Book(2, "疯狂Android讲义", "李刚"));
		 bookList.add(new Book(3, "疯狂iOS讲义", "李刚"));
		 bookList.add(new Book(4, "轻量级JavaEE企业应用实战", "李刚"));
		 bookList.add(new Book(5,"Spring MVC企业应用实战","肖文吉"));
		// 页面用于遍历的Map集合<Integer,Book>
		 Map<Integer, Book> bookMap = new HashMap<Integer, Book>();
		 bookMap.put(1, new Book(1, "疯狂Java讲义", "李刚"));
		 bookMap.put(2, new Book(2, "疯狂Android讲义", "李刚"));
		 bookMap.put(3, new Book(3, "疯狂iOS讲义", "李刚"));
		 bookMap.put(4, new Book(4, "轻量级JavaEE企业应用实战", "李刚"));
		 bookMap.put(5, new Book(5,"Spring MVC企业应用实战","肖文吉"));
		 // model中添加属性
		 model.addAttribute("courseList",courseList);
    	 model.addAttribute("bookList",bookList);
    	 model.addAttribute("bookMap",bookMap);
	     return "forEachTest";
	 }
	 
}

