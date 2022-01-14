package com.test.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("t9")
@Lazy
public class TestBean5 {

	public TestBean5() {
		System.out.println("TestBean5");
	}
	
	// 생성자 호출 이후에 자동으로 호출되는 메서드와
	// 객체 소멸전에 호출될 메서드를 지정한다.
	// Component 어노테이션과 관계가 없지만
	// bean에 대한 설정을 bean에 직접하는 것을 살펴보고 있기 때문에
	// 한 번더 보고감
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean5의 init 메서드 호출");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean5의 destroy 메서드 호출");
	}
}
