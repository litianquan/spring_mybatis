package org.fkit.domain;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

	private Integer id;  // 订单id，主键
	private String code;  // 订单编号
	private Double total; // 订单总金额
	
	// 订单和用户是多对一的关系，即一个订单只属于一个用户
	private User user;
	
	// 订单和商品是多对多的关系，即一个订单可以包含多种商品
	private List<Article> articles;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String code, Double total) {
		super();
		this.code = code;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", total=" + total + "]";
	}
	
	
}
