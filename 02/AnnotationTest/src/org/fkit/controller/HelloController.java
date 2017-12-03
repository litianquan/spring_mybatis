package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

/**
 *  HelloController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class HelloController{

	 private static final Log logger = LogFactory
	            .getLog(HelloController.class);
	 
	 /**
	  * org.springframework.web.bind.annotation.RequestMapping注解
	  * 用来映射请求的的URL和请求的方法等。本例用来映射"/hello"
	  * hello只是一个普通方法。
	  * 该方法返回一个包含视图路径或视图路径和模型的ModelAndView对象。
	  * */
	 @RequestMapping(value="/hello")
	 public ModelAndView hello(){
		 logger.info("hello方法 被调用");
		 // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		 ModelAndView mv = new ModelAndView();
		 //添加模型数据 可以是任意的POJO对象  
	     mv.addObject("message", "Hello World!");  
	     // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
	     mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	 }

}

