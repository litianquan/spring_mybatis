package org.fkit.test;


import org.apache.ibatis.session.SqlSession;
import org.fkit.factory.FKSqlSessionFactory;

public class DeleteTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 删除id为1的User对象
		session.delete("org.fkit.mapper.UserMapper.removeUser", 1);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
