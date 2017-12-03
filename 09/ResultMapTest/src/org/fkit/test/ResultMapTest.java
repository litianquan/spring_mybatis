package org.fkit.test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;

public class ResultMapTest {

	public static void main(String[] args) {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 查询TB_USER表所有数据返回List集合,集合中的每个元素都是一个Map
		List<User> user_list 
			= session.selectList("org.fkit.mapper.UserMapper.selectUser2");
		// 遍历List集合，打印每一个Map对象
		for(User user : user_list){
			System.out.println(user);
		}
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();

	}

}
