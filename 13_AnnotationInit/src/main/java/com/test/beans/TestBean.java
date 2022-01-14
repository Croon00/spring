package com.test.beans;

public class TestBean {

	public TestBean() {
		System.out.println("TestBean의 생성자 입니다.");
	}
	
	public void testInit() {
		System.out.println("init 메서드 입니다.");
	}
	
	public void testDestroy() {
		System.out.println("destroy 메서드 입니다.");
	}
}
