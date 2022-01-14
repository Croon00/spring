package com.test.beans;

import org.springframework.stereotype.Component;

// bean 등록
// 이름을 정해주지 않았기 때문에 타입을 통해
// bean을 가져올 수 있다.
// IoC 컨테이너 객체가 생성될 때 자동으로 객체가 생성된다.
// singleton : 객체를 하나만 생성하여 생성된 객체를 계속 사용한다.

@Component
public class TestBean1 {

	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
}
