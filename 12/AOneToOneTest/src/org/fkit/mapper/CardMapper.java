package org.fkit.mapper;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Card;

public interface CardMapper {

	@Select("SELECT * FROM TB_CARD WHERE ID = #{id} ")
	Card selectCardById(Integer id);
	
}
