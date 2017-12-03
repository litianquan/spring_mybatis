package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;


public class InsertTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 创建UserMapper实例
		UserMapper um = session.getMapper(UserMapper.class);
		// 创建User对象并设置属性
		User user = new User();
		user.setName("test");
		user.setSex("男");
		user.setAge(18);
		// 插入数据
		um.saveUser(user);
		// 查看插入数据生成的主键
		System.out.println("插入数据生成的主键id为：" + user.getId());
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
