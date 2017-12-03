package org.fkit.mapper;


import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Order;

public interface OrderMapper {

	@Select("SELECT * FROM TB_ORDER WHERE ID = #{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(column="total",property="total"),
		@Result(column="user_id",property="user",
			one=@One(select="org.fkit.mapper.UserMapper.selectById",
		fetchType=FetchType.EAGER)),
		@Result(column="id",property="articles",
			many=@Many(select="org.fkit.mapper.ArticleMapper.selectByOrderId",
		fetchType=FetchType.LAZY))
	})
	Order selectById(Integer id);
	
}
