package org.fkit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.fkit.domain.Employee;

public interface EmployeeMapper {
	
	// 动态查询
	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="selectWhitParam")
	List<Employee> selectWhitParam(Map<String, Object> param);
	
	// 动态插入
	@InsertProvider(type=EmployeeDynaSqlProvider.class,method="insertEmployee")
	@Options(useGeneratedKeys = true, keyProperty = "id")  
	int insertEmployee(Employee employee);
	
	// 根据id查询
	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="selectWhitParam")
	Employee selectEmployeeWithId(Map<String, Object> param);
	
	// 动态更新
	@UpdateProvider(type=EmployeeDynaSqlProvider.class,method="updateEmployee")
	void updateEmployee(Employee employee);

	// 动态删除
	@DeleteProvider(type=EmployeeDynaSqlProvider.class,method="deleteEmployee")
	void deleteEmployee(Map<String, Object> param);
	
}
