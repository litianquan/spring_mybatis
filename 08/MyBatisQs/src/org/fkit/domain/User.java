
package org.fkit.domain;

import java.io.Serializable;

/**
 * 官方网站
 * www.fkjava.org
 * www.facejava.org
 * 学习交流论坛
 * www.crazyit.org
 *
 * @author 肖文吉
 * 
 * CREATE TABLE `tb_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(18) DEFAULT NULL,
  `sex` CHAR(2) DEFAULT NULL,
  `age` INT(11) DEFAULT NULL,
  PRIMARY KEY  (`id`)
)
 */
public class User implements Serializable{
	// 用户标识
	private Integer id;
	// 用户姓名
	private String name;
	// 用户性别
	private String sex;
	// 用户年龄
	private Integer age;
	
	// 无参数构造器
	public User() {
		super();
	}
	// 有参数构造器
	public User( String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	 // setter和getter方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age="
				+ age + "]";
	}
	
	

}
