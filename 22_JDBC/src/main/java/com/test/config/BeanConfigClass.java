package com.test.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.test.beans")
@ComponentScan(basePackages = "com.test.db")
public class BeanConfigClass {

	// DataSource
	// 데이터 베이스 접속 정보를 관리하는 bean
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("jdbc_user");
		source.setPassword("1234");
		
		return source;
	}
	
	// 데이터베이스에 접속해서 쿼리를 전달하는 bean
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}
