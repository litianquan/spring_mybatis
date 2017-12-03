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
	
	private String loginname;
	private String password;
	private String username;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "User [loginname=" + loginname + ", password=" + password
				+ ", username=" + username + "]";
	}

	
	
	
}
