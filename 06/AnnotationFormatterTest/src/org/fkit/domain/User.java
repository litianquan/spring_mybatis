package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 域对象，实现序列化接口
public class User implements Serializable{
	
	// 日期类型
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	// 正常数字类型
	@NumberFormat(style=Style.NUMBER, pattern="#,###")  
    private int total;  
	// 百分数类型
    @NumberFormat(style=Style.PERCENT)  
    private double discount;  
    // 货币类型
    @NumberFormat(style=Style.CURRENCY)  
    private double money;  
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [birthday=" + birthday + ", total=" + total
				+ ", discount=" + discount + ", money=" + money + "]";
	}

	

	

}
