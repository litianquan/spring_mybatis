package org.fkit.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Person;

public interface PersonMapper {
	
	@Select("SELECT * FROM TB_PERSON WHERE ID = #{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="sex",property="sex"),
		@Result(column="age",property="age"),
		@Result(column="card_id",property="card",
		one=@One(
				select="org.fkit.mapper.CardMapper.selectCardById",
				fetchType=FetchType.EAGER))
	})
	Person selectPersonById(Integer id);

}
