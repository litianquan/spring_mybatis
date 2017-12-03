package org.fkit.mapper;

import org.fkit.domain.Clazz;

public interface ClazzMapper {

	// 根据id查询班级信息
	Clazz selectClazzById(Integer id);
	
}
