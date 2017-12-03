package org.fkit.domain;

import java.io.Serializable;

/**
 *
 CREATE TABLE tb_clazz(
id INT PRIMARY KEY AUTO_INCREMENT,
CODE VARCHAR(18),
NAME VARCHAR(18)
);

INSERT INTO tb_clazz(CODE,NAME) VALUES('j1601','Java就业班');

CREATE TABLE tb_student(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
sex VARCHAR(18),
age INT,
clazz_id INT,
FOREIGN KEY (clazz_id) REFERENCES tb_clazz(id)
);

INSERT INTO tb_student(NAME,sex,age,clazz_id) VALUES('jack','男',23,1);
INSERT INTO tb_student(NAME,sex,age,clazz_id) VALUES('rose','女',18,1);
INSERT INTO tb_student(NAME,sex,age,clazz_id) VALUES('tom','男',21,1);
INSERT INTO tb_student(NAME,sex,age,clazz_id) VALUES('alice','女',20,1);

 * */
public class Student implements Serializable {

	private Integer id; // 学生id，主键
	private String name; // 姓名
	private String sex;  // 性别
	private Integer age; // 年龄
	
	// 学生和班级是多对一的关系，即一个学生只属于一个班级
	private Clazz clazz;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + "]";
	}

	
}
