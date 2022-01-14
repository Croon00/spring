package com.test.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.beans.JdbcBean;

public interface MapperInterface {

	// select
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	// insert
	// 값이 들어가는 부분에는 매개변수로 들어오는 bean의 변수 이름을 작성해준다.
	// #부분에 getData부분이 불림
	@Insert("insert into jdbc_table (int_data, str_data) values (#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean);
	
	// update
	// 값이 들어가는 부분에는 매개변수로 들어오는 bean의 변수 이름을 작성해준다.
	@Update("update jdbc_table set str_data = #{str_data} where int_data = #{int_data}")
	void update_data(JdbcBean bean);
	
	
	// delete
	// 매개 변수로 값 하나만 받을 때는 {  } 안에 아무 문자열이나 작성해도 된다.
	// 매개 변수로 값 두 개 이상을 받아야 할 경우에는 위의 경우와 같은 bean을
	// 활용한다.
	@Delete("delete from jdbc_table where int_data = #{abc}")
	void delete_data(int int_data);
}
