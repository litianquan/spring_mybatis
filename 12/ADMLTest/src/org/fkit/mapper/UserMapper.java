package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;

public interface UserMapper {
	
	@Insert("INSERT INTO TB_USER(name,sex,age) VALUES(#{name},#{sex},#{age})")
	@Options(useGeneratedKeys=true,keyProperty="id")
//	@SelectKey(before=false,keyProperty="id",resultType=Integer.class,
//	statement="SELECT LAST_INSERT_ID() AS id")
	int saveUser(User user);
	
	@Delete("DELETE FROM TB_USER WHERE id = #{id}")
	int removeUser(@Param("id") Integer id);
	
	@Update("UPDATE TB_USER SET name = #{name},sex = #{sex},age = #{age} WHERE id = #{id}")
	void modifyUser(User user);
	
	@Select("SELECT * FROM TB_USER WHERE id = #{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="sex",property="sex"),
		@Result(column="age",property="age")
	})
	User selectUserById(@Param("id") Integer id);
	
	@Select("SELECT * FROM TB_USER ")
	List<User> selectAllUser();

}
