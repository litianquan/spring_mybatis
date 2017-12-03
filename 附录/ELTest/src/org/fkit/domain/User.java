package org.fkit.domain;

public class User {
	
	private String username;
	private Dept dept;
	
	public User() {
		super();
		this.username="周杰伦";
		dept = new Dept("开发部");
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	

}
