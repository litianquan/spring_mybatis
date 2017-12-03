package org.fkit.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Student;
import org.fkit.factory.FKSqlSessionFactory;

public class SelectStudentTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 查询TB_USER表所有数据返回List集合,集合中的每个元素都是一个Student对象
		List<Student> student_list 
			= session.selectList("org.fkit.mapper.UserMapper.selectStudent");
		// 遍历List集合，打印每一个Student对象，该对象包含关联的Clazz对象
		for(Student stu : student_list){
			System.out.println(stu);
		}
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
