
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
	
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User( String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

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
