package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Student;

public interface StudentMapper {
	
	// 根据班级id查询班级所有学生
	@Select("SELECT * FROM TB_STUDENT WHERE CLAZZ_ID = #{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="sex",property="sex"),
		@Result(column="age",property="age")
	})
	List<Student> selectByClazzId(Integer clazz_id);
		
}
