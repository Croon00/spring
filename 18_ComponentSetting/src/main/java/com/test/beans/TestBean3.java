package com.test.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component("t5")
// IoC 컨테이너가 생성될 때 객체가 생성되지 않는다.
// 최초로 bean을 사용할 때 객체가 생성된다.
// Singleton : 하나만 생성해서 사용한다.
@Lazy
public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
}
