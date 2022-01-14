package com.test.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// select문을 통해서 가져온 데이터를
// 담을 bean
// 반드시 컬럼이름과 동일한 이름으로 변수를 선언해주세요
@Component
@Scope("prototype")
public class JdbcBean {
	private int int_data;
	private String str_data;
	
	public int getInt_data() {
		return int_data;
	}
	public void setInt_data(int int_data) {
		this.int_data = int_data;
	}
	public String getStr_data() {
		return str_data;
	}
	public void setStr_data(String str_data) {
		this.str_data = str_data;
	}
	
	
}
