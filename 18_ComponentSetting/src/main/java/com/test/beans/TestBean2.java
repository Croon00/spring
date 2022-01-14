package com.test.beans;

import org.springframework.stereotype.Component;

// IoC 컨테이너가 생성될 때 자동으로 객체가 생성된다.
// 이름을 통해 객체를 가져올 수 있다.
// Singleton : 하나만 생성해서 사용한다.

@Component("t3")
public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
}
