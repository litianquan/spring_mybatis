package org.fkit.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 实现Converter<S,T>接口
public class StringToDateConverter implements Converter<String, Date>{

	// 日期类型模板：如yyyy-MM-dd
	private String datePattern;
	
	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	// Converter<S,T>接口的类型转换方法
	@Override
	public Date convert(String date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
			// 将日期字符串转换成Date类型返回
			return dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("日期转换失败!");
			return null;
		}
		
	}

}
