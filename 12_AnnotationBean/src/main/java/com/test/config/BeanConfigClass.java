package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;

// 이 클래ㅡ가 bean 설정을 위한 클래스라는 설정을 한다.
@Configuration
public class BeanConfigClass {
	
	
	// IoC 컨테이너 생성시 자동으로 호출되며
	// 반환하는 객체를 IoC 컨테이너에 담아준다.
	// 메서드의 이름이 등록되는 bean의 id로 설정된다.
	// getBean 메서드를 사용하면 새롭게 객체가 생성되는 것이 아닌
	// IoC 컨테이너에 저장되어 있는 객체를 반환한다.
	// 객체는 딱 하나만 생성해서 사용하게 된다.
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	// IoC 컨테이너가 생성될 때 객체가 생성되지 않고
	// 최초의 getBean 메서드 호출 시 생성된다.
	// 그 이후에는 생성된 객체를 반환한다.
	@Lazy
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	@Bean
	// getBean 메서드를 사용할 때마다 이 메서드를 호출하여
	// 반환하는 객체를 전달한다.
	// getBean 메서드를 사용할 때마다 새롭게 객체가 생성된다.
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
}
	

