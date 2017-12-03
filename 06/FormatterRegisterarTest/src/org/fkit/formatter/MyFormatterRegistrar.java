package org.fkit.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
public class MyFormatterRegistrar implements FormatterRegistrar{
	
	private DateFormatter dateFormatter;

	public void setDateFormatter(DateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
	}

	@Override
	public void registerFormatters(FormatterRegistry registry) {
		
		registry.addFormatter(dateFormatter);
		
	}

}
