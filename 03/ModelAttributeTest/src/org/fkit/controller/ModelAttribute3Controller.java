package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class ModelAttribute3Controller{
	
	// 静态List<User>集合，此处代替数据库用来保存注册的用户信息
	private static List<User> userList;
	
	// UserController类的构造器，初始化List<User>集合
	public ModelAttribute3Controller() {
		super();
		userList = new ArrayList<User>();
		User user1 = new User("test","123456","测试用户");
		User user2 = new User("admin","123456","管理员");
		// 存储User用户，用于模拟数据库数据
		userList.add(user1);
		userList.add(user2);
	}
	
	// 根据登录名和密码查询用户，用户存在返回包含用户信息的User对象，不存在返回null
	public User find(String loginname,String password){
		for(User user: userList){
			if(user.getLoginname().equals(loginname) && user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}

	// model属性的名称没有指定，它由返回类型隐含表示，如这个方法返回User类型，那么这个model属性的名称是user。
    // 这个例子中model属性名称由返回对象类型隐含表示，model属性对象就是方法的返回值。它不需要指定特定的参数。
	@ModelAttribute
	public User userModel3( 
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password){
		return find(loginname, password);
	}

	@RequestMapping(value="/login3")
	 public String login3() {
		 return "result3";
	 }

}

