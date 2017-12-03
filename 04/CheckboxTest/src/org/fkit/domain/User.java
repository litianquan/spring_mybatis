package org.fkit.domain;

import java.io.Serializable;
import java.util.List;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 域对象，实现序列化接口
public class User implements Serializable{
	
	private boolean reader;
	private List<String> courses;
	
	public User() {
		super();
	}


	public boolean isReader() {
		return reader;
	}


	public void setReader(boolean reader) {
		this.reader = reader;
	}


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}


	
	
}
