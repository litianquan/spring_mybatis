package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
@Controller
@RequestMapping("/json")
public class BookController {
	
	
    @RequestMapping(value="/testRequestBody")
    // @ResponseBody会将集合数据转换json格式返回客户端
    @ResponseBody
    public Object getJson() {
    	List<Book> list = new ArrayList<Book>();
    	list.add(new Book(1,"Spring MVC企业应用实战","肖文吉"));
    	list.add(new Book(2,"轻量级JavaEE企业应用实战","李刚"));
    	return list;
    }

}
