package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;


public class SelectTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 创建UserMapper实例
		UserMapper um = session.getMapper(UserMapper.class);
		// 根据id查询User对象
		User user = um.selectUserById(1);
		// 查看查询到的User对象
		System.out.println(user);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
