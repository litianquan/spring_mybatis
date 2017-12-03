package org.fkit.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Employee;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.EmployeeMapper;


public class DynamicSQLTest {

	public static void main(String[] args) throws Exception {

		// 创建Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		
		DynamicSQLTest t = new DynamicSQLTest();
		// 获取EmployeeMapper对象
		EmployeeMapper em = session.getMapper(EmployeeMapper.class);
		
//		t.testSelectWhitParam(em);
		
//		t.testInsertEmployee(em);
		
//		t.testUpdateEmployee(em);
		
		t.testDeleteEmployee(em);
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}
	
	// 根据动态参数查询员工数据
	public void testSelectWhitParam(EmployeeMapper em){
		// 使用Map装载参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("loginname", "jack");
		param.put("password", "123456");
		// 调用selectWhitParam方法
		List<Employee> list = em.selectWhitParam(param);
		// 查看返回结果
		System.out.println(list);
	}
	
	// 根据设置的属性动态插入数据
	public void testInsertEmployee(EmployeeMapper em){
		
		Employee e = new Employee();
		e.setLoginname("mary");
		e.setPassword("123456");
		e.setName("玛丽");
		e.setSex("女");
		e.setAge(20);
		e.setPhone("13902019999");
		e.setSal(9800.99);
		// 注意：没有设置state属性，则insert语句中不会包含state列
		// e.setState("ACTIVE");
		em.insertEmployee(e);
		
		System.out.println("插入成功，返回id：" + e.getId());

	}
	
	// 根据设置的属性动态更新数据
	public void testUpdateEmployee(EmployeeMapper em){
		// 使用Map装载参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 5);
		// 查询id为1的员工
		Employee e = em.selectEmployeeWithId(param);
		// 修改员工对象的三个属性
		e.setLoginname("update");
		e.setPassword("fkjava");
		e.setName("测试");
		// 动态更新
		em.updateEmployee(e);
	}
	
	// 根据设置的属性动态删除数据
	public void testDeleteEmployee(EmployeeMapper em){
		// 使用Map装载参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("loginname", "jack");
		param.put("password", "123456");
		// 动态删除
		em.deleteEmployee(param);

	}
	
	

}
