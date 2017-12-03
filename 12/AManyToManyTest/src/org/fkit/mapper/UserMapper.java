package org.fkit.mapper;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;

public interface UserMapper {

	@Select("SELECT * FROM TB_USER WHERE ID = #{id} ")
	User selectById(Integer id);
	
}
