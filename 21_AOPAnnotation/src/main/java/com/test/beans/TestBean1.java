package com.test.beans;

import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
	
	public void method1() {
		System.out.println("TestBean1의 method1");
		
		// afterThrwoing 테스트를 위한 오류 발생 코드
		int a1 = 10 / 0;
		System.out.println(a1);
	}
}
