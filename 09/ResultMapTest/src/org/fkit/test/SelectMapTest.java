package org.fkit.test;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.fkit.factory.FKSqlSessionFactory;

public class SelectMapTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 查询TB_USER表所有数据返回List集合,集合中的每个元素都是一个Map
		List<Map<String,Object>> list 
			= session.selectList("org.fkit.mapper.UserMapper.selectUser");
		// 遍历List集合，打印每一个Map对象
		for(Map<String,Object> row : list){
			System.out.println(row);
		}
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
