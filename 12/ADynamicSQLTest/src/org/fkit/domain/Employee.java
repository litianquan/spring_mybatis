package org.fkit.domain;

import java.io.Serializable;

/**
 * 
 CREATE TABLE tb_employee (
  ID INT(11) PRIMARY KEY AUTO_INCREMENT,
  loginname VARCHAR(18),
  PASSWORD VARCHAR(18),
  NAME VARCHAR(18) DEFAULT NULL,
  SEX CHAR(2) DEFAULT NULL,
  AGE INT(11) DEFAULT NULL,
  phone VARCHAR(21),
  sal DOUBLE,
  state VARCHAR(18)
 )
 
 INSERT INTO tb_employee(loginname,PASSWORD,NAME,sex,age,phone,sal,state)
 VALUES('jack','123456','杰克','男',26,'13902019999',9800,'ACTIVE');
  INSERT INTO tb_employee(loginname,PASSWORD,NAME,sex,age,phone,sal,state)
 VALUES('rose','123456','露丝','女',21,'13902018888',6800,'ACTIVE');


 * */

public class Employee implements Serializable {
	
	private Integer id;			 // 主键id
	private String loginname;	 // 登录名
	private String password;	 // 密码
	private String name;		 // 真实姓名
	private String sex;			 // 性别
	private Integer age;		 // 年龄
	private String phone;		 // 电话
	private Double sal;		     // 薪水
	private String state;	 	 // 状态
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", loginname=" + loginname
				+ ", password=" + password + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", phone=" + phone + ", sal=" + sal
				+ ", state=" + state + "]";
	}
	
	
	

}
