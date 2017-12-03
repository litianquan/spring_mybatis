package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Clazz;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.ClazzMapper;

public class OneToManyTest {

	public static void main(String[] args) throws Exception {

		// 获取Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 获取ClazzMapper实例
		ClazzMapper cm = session.getMapper(ClazzMapper.class);
		// 根据id查询Clazz对象
		Clazz clazz = cm.selectById(1);
		// 查看查询到的Clazz对象
		System.out.println(clazz.getId() + " "+ clazz.getCode() + " "+clazz.getName());
		// 查看关联的学生集合，因为配置使用的是LAZY懒加载，所以当使用时才执行SQL语句
		clazz.getStudents().forEach(student->System.out.println(student));
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}


}
