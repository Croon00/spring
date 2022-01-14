package com.test.main;

import com.test.beans.HelloWorldEn;
import com.test.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HelloWorldEn 클래스를 통해 객체를 생성하고
		// 생성한 객체를 callMethod를 호출할 때 전달 하였다.
		// callMethod 메소드는 매개변수로 받은 객체를
		// 통해 sayHello 메서드를 호출하였다.
		
		// 그 후, HelloWorldEn 클래스를 사용하던 곳을
		// HelloWorldKo 클래스로 변경해야 되는 상황이
		// 발생한 것을 가정한다.
		
		// 객체 생성
		// HelloWorldEn hello = new HelloWorldEn();
		HelloWorldKo hello = new HelloWorldKo();
		hello.sayHello();
		
		callMethod(hello);
	}
	
	//public static void callMethod(HelloWorldEn hello) {
	public static void callMethod(HelloWorldKo hello) {

		hello.sayHello();
	}

}
