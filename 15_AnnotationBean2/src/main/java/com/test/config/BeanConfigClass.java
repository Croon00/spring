package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;
import com.test.beans.TestBean1;

// @Required 테스트를 위해 @Configuration을 주석처리하고
// pom.xml의 Spring 버전을 4.x로 설정해주세요
@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		// data1이 @Required가 붙어 있지만
		// 값을 주입하지 않아도 오류가 발생하지 않는다.
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public DataBean1 data_bean1() {
		DataBean1 d1 = new DataBean1();
		return d1;
	}
	
	@Bean
	public DataBean2 obj4() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
	
	@Bean
	public DataBean2 obj5() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
}
