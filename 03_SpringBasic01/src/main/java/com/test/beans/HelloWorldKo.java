package com.test.beans;

public class HelloWorldKo extends HelloWorld{
	
	// 부모 클래스인 HelloWorld 클래스가 가지고 있는
	// sayHello 메서드를 재 구현 하였다.	
	public void sayHello() {
		System.out.println("안녕하세요");
	}
}
