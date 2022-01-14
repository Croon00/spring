package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.test.beans.TestBean1;
import com.test.beans2.TestBean3;

@Configuration
//<!-- 패키지를 스캔하여 -->
//<!-- 각 클래스에 정의된 어노테이션을 보고 -->
//<!-- bean을 등록한다. -->
//@ComponentScan(basePackages = "com.test.beans")
//@ComponentScan(basePackages = "com.test.beans2")

@ComponentScan(basePackages = {"com.test.beans","com.test.beans2"})
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean3 java100() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
}