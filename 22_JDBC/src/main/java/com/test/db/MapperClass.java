package com.test.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.test.beans.JdbcBean;

// Mapper 클래스 : 로우 하나의 데이터를 추출해
// bean 객체에 담아주는 역할을 한다.
@Component
public class MapperClass implements RowMapper<JdbcBean>{

	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		// 데이터를 담을 bean을 생성한다.
		JdbcBean bean = new JdbcBean();
		// 컬럼의 이름을 통해 데이터를 추출해 bean에 담아준다.
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}

}
