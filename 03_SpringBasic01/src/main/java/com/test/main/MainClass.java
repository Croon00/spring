package com.test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.HelloWorld;

public class MainClass {
	
	// Maven 프로젝트
	// Maven 서버(jar 파일들을 모아놓은 서버)를 통해
	// 필요한 라이브러리를 내려받아 셋팅한 프로젝트
	
	// pom.xml
	// Maven 서버에 있는 jar 파일들 중에 사용하고자 
	// 하는 jar 파일을 명시하는 파일
	
	// bean configurations file 
	// xml 파일로써 이름은 자유롭게 설정한다.
	// 이 파일은 현재 프로그램에서 사용할 객체를들을 정의한다.
	// 여기에 정의한 객체를 bean이라고 부릅니다.
	// bean은 한 저장소에 모이게 되고 같은 프로젝트 내부라면
	// 어디서든지 가져다 사용할 수 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bean configurations file을 로딩한다.
		ClassPathXmlApplicationContext ctx 
			= new ClassPathXmlApplicationContext("com/test/main/beans.xml");
		
		// 객체를 받아온다.
		// bean configurations file에 id가 hello로 정의되어 있는 클래스로 
		// 객체를 생성하여 받아온다.
		HelloWorld hello = (HelloWorld)ctx.getBean("hello");
		callMethod(hello);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
