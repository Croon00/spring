package com.test.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t7")
// getBean 메서드를 호출 할 때마다 객체가 생성된다.
@Scope("prototype")
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4의 생성자");
	}
}
