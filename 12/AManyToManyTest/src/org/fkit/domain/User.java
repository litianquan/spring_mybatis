package org.fkit.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * 
 CREATE TABLE tb_user(
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(18),
loginname VARCHAR(18),
PASSWORD VARCHAR(18),
phone VARCHAR(18),
address VARCHAR(18)
);

INSERT INTO tb_user(username,loginname,PASSWORD,phone,address)
VALUES('杰克','jack','123456','13920001616','广州');

CREATE TABLE tb_article(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
price DOUBLE,
remark VARCHAR(18)
);

INSERT INTO tb_article(NAME,price,remark) 
VALUES('疯狂Java讲义',108.9,'李刚老师经典著作');
INSERT INTO tb_article(NAME,price,remark) 
VALUES('疯狂Android讲义',99.9,'李刚老师经典著作');
INSERT INTO tb_article(NAME,price,remark) 
VALUES('疯狂iOS讲义',89.9,'李刚老师经典著作');
INSERT INTO tb_article(NAME,price,remark) 
VALUES('SpringMVC+MyBatis企业开发',69.9,'肖文吉老师经典著作');


CREATE TABLE tb_order(
id INT PRIMARY KEY AUTO_INCREMENT,
CODE VARCHAR(32),
total DOUBLE,
user_id INT,
FOREIGN KEY (user_id) REFERENCES tb_user(id)
);

INSERT INTO tb_order(CODE,total,user_id)
VALUES('6aa3fa359ff14619b77fab5990940a2d',388.6,1);

INSERT INTO tb_order(CODE,total,user_id)
VALUES('6aa3fa359ff14619b77fab5990940b3c',217.8,1);

CREATE TABLE tb_item(
order_id INT,
article_id INT,
amount INT,
PRIMARY KEY(order_id,article_id),
FOREIGN KEY (order_id) REFERENCES tb_order(id),
FOREIGN KEY (article_id) REFERENCES tb_article(id)
);

INSERT INTO tb_item(order_id,article_id,amount) 
VALUES(1,1,1);
INSERT INTO tb_item(order_id,article_id,amount) 
VALUES(1,2,1);
INSERT INTO tb_item(order_id,article_id,amount) 
VALUES(1,3,2);

INSERT INTO tb_item(order_id,article_id,amount) 
VALUES(2,4,2);
INSERT INTO tb_item(order_id,article_id,amount) 
VALUES(2,1,1);

 * */
public class User implements Serializable{
	
	private Integer id;  // 用户id，主键
	private String username;  // 用户名
	private String loginname; // 登录名
	private String password;  // 密码
	private String phone;    // 联系电话
	private String address;  // 收货地址
	
	// 用户和订单是一对多的关系，即一个用户可以有多个订单
	private List<Order> orders;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String loginname, String password,
			String phone, String address) {
		super();
		this.username = username;
		this.loginname = loginname;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginname="
				+ loginname + ", password=" + password + ", phone=" + phone
				+ ", address=" + address + "]";
	}


}
