package org.fkit.mapper;

import org.fkit.domain.Student;

public interface StudentMapper {

	// 根据id查询学生信息
	Student selectStudentById(Integer id);
	
}
