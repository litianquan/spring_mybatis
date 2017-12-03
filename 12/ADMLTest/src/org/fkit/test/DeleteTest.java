package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;


public class DeleteTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 创建UserMapper实例
		UserMapper um = session.getMapper(UserMapper.class);
		// 删除User对象
		um.removeUser(5);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
