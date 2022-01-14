package com.test.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	// 생성자 호출 이후에 자동으로 호출되는 메서드 등록
	// initMethod 대신 사용한다.
	@PostConstruct
	public void init() {
		System.out.println("TestBean2의 init 메서드");
	}
	
	
	// 객체가 소멸되기 전에 자동으로 호출되는 메서드 등록
	// destroyMethod 대신 사용한다.
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean2의 destroy메서드");
	}
}
