package org.fkit.test;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fkit.domain.Clazz;
import org.fkit.domain.Student;
import org.fkit.mapper.ClazzMapper;
import org.fkit.mapper.StudentMapper;

public class OneToManyTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		
		OneToManyTest t = new OneToManyTest();
		
		t.testSelectClazzById(session);
//		t.testSelectStudentById(session);
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}
	
	// 测试一对多，查询班级Clazz（一）的时候级联查询学生Student（多）  
	public void testSelectClazzById(SqlSession session){
		// 获得ClazzMapper接口的代理对象
		ClazzMapper cm = session.getMapper(ClazzMapper.class);
		// 调用selectClazzById方法
		Clazz clazz = cm.selectClazzById(1);
		// 查看查询到的clazz对象信息
		System.out.println(clazz.getId() + " "+ clazz.getCode() + " "+clazz.getName());
		// 查看clazz对象关联的学生信息
		List<Student> students = clazz.getStudents();
		for(Student stu : students){
			System.out.println(stu);
		}
	}
	
	// 测试多对一，查询学生Student（多）的时候级联查询 班级Clazz（一）
	public void testSelectStudentById(SqlSession session){
		// 获得StudentMapper接口的代理对象
		StudentMapper sm = session.getMapper(StudentMapper.class);
		// 调用selectStudentById方法
		Student stu = sm.selectStudentById(1);
		// 查看查询到的Student对象信息
		System.out.println(stu);
		// 查看Student对象关联的班级信息
		System.out.println(stu.getClazz());
	}

}
