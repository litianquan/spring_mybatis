package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_card(
id INT PRIMARY KEY AUTO_INCREMENT,
CODE VARCHAR(18)
);

INSERT INTO tb_card(CODE) VALUES('432801198009191038');

CREATE TABLE tb_person(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
sex VARCHAR(18),
age INT,
card_id INT UNIQUE,
FOREIGN KEY (card_id) REFERENCES tb_card(id)
);

INSERT INTO tb_person(NAME,sex,age,card_id) VALUES('jack','男',23,1)

 * */
public class Person implements Serializable {

	private Integer id;  // 主键id
	private String name; // 姓名
	private String sex;  // 性别
	private Integer age; // 年龄
	
	// 人和身份证是一对一的关系，即一个人只有一个身份证
	private Card card; 

	public Person() {
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + "]";
	}

	
	
	
	
}
