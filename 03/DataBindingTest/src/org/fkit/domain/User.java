package org.fkit.domain;

import java.io.Serializable;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @date 2015年9月21日 下午4:21:31 
 * @version V1.0   
 */

// 域对象，实现序列化接口
public class User implements Serializable{
	
	// 私有字段
	private String loginname;
	private String password;
	private String username;
	
	// 公共构造器
	public User() {
		super();
	}
	// set/get方法
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
