package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.test.beans.TestBean;

@Configuration
public class BeanConfigClass {
		
	
	// initMethod : 생성자 호출 이후 자동으로 호출될 메서드
	// destroyMethod : 객체 소멸 직전에 자동으로 호출될 메서드
	@Bean(initMethod = "testInit", destroyMethod = "testDestroy")
	@Lazy
	public TestBean java1() {
		TestBean t1 = new TestBean();
		return t1;
	}
	
	
}
