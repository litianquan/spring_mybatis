package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;

public class TestOneLevelCache {

	public static void main(String[] args) throws Exception {
		
		TestOneLevelCache t = new TestOneLevelCache();
		
		t.testCache1();
//		t.testCache2();
//		t.testCache3();
	}
	
	 /*
	  * 一级缓存: 也就Session级的缓存(默认开启)
	  */
	public void testCache1 (){
		// 使用工厂类获得SqlSession对象
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 获得UserMapping对象
		UserMapper um = session.getMapper(UserMapper.class);
		// 查询id为1的User对象，会执行select语句
		User user = um.selectUserById(1);
		System.out.println(user);
		// 再次查询id为1的User对象,因为是同一个SqlSession,所以会从之前的一级缓存中查找数据
		User user2 = um.selectUserById(1);
		System.out.println(user2);
		// 关闭SqlSession对象
		session.close();
	}
	
	public void testCache2 (){
		// 使用工厂类获得SqlSession对象
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 获得UserMapping对象
		UserMapper um = session.getMapper(UserMapper.class);
		// 查询id为1的User对象，会执行select语句
		User user = um.selectUserById(1);
		System.out.println(user);
		// 执行delete操作
		um.deleteUserById(5);
		// commit提交
		session.commit();
		// 再次查询id为1的User对象,因为DML操作会清空SqlSession缓存,所以会再次执行select语句
		User user2 = um.selectUserById(1);
		System.out.println(user2);
		// 关闭SqlSession对象
		session.close();
	}
	
	public void testCache3 (){
		// 使用工厂类获得SqlSession对象
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 获得UserMapping对象
		UserMapper um = session.getMapper(UserMapper.class);
		// 查询id为1的User对象，会执行select语句
		User user = um.selectUserById(1);
		System.out.println(user);
		// 关闭一级缓存
		session.close();
		// 再次访问,需要再次获取一级缓存，然后才能查找数据，否则会抛出异常
		session = FKSqlSessionFactory.getSqlSession();
		// 再次获得UserMapping对象
		um = session.getMapper(UserMapper.class);
		// 再次访问，因为现在使用的是一个新的SqlSession对象,所以会再次执行select语句
		User user2 = um.selectUserById(1);
		System.out.println(user2);
		// 关闭SqlSession对象
		session.close();
	}

}
