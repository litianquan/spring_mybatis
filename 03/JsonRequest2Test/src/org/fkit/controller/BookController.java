package org.fkit.controller;

import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.JSONObject;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
@Controller
@RequestMapping("/json")
public class BookController {
	
	private static final Log logger = LogFactory.getLog(BookController.class);
	
	// @RequestBody根据json数据，转换成对应的Object
    @RequestMapping(value="/testRequestBody")
    public void setJson(@RequestBody Book book,
    		HttpServletResponse response) throws Exception{
    	// JSONObject-lib包是一个beans,collections,maps,java arrays和xml和JSON互相转换的包。
    	// 使用JSONObject将book对象转换成json输出
    	logger.info(JSONObject.toJSONString(book));
    	book.setAuthor("肖文吉");
    	response.setContentType("text/html;charset=UTF-8");
    	// 将book对象转换成json写出到客户端
    	response.getWriter().println(JSONObject.toJSONString(book));
    }

}
