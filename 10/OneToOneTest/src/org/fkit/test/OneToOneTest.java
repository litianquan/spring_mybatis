package org.fkit.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fkit.domain.Person;
import org.fkit.mapper.PersonMapper;

public class OneToOneTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		
		/*Person p 
		= session.selectOne("org.fkit.mapper.PersonMapper.selectPersonById",1);
		System.out.println(p);
		System.out.println(p.getCard().getCode());*/
		// 获得mapper接口的代理对象
		PersonMapper pm = session.getMapper(PersonMapper.class);
		// 直接调用接口的方法，查询id为1的Peson数据
		Person p = pm.selectPersonById(1);
		// 打印Peson对象
		System.out.println(p);
		// 打印Person对象关联的Card对象
		System.out.println(p.getCard());
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
