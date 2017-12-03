package org.fkit.domain;

import java.io.Serializable;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 域对象，实现序列化接口
public class User implements Serializable{
	
	// 私有字段
	private String username;
	private String sex;
	private Integer age;
	
	public User() {
		super();
	}

	public User(String username, String sex, Integer age) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", age=" + age
				+ "]";
	}

	
	
	
}
