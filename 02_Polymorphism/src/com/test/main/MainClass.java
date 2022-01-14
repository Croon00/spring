package com.test.main;

import com.test.beans.HelloWorld;
import com.test.beans.HelloWorldEn;
import com.test.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HelloWorldEn 과 HelloWorldKo는
		// HelloWorld 클래스를 상속 받았기 때문에
		// 부모 클래스인 HelloWorld 형 변수에 담을 수 있다.
		// 이 때, 두 클래스 모두 부모 클래스인 HelloWorld 클래스가
		// 가진 sayHello 메서드를 재구현(overriding)하였기 때문에
		// 부모형 변수를 통해 메서드를 호출하면 부모가 가진 메서드가 아닌
		// 자식들을 재구현한 메서드를 호출하게 된다.
		// 즉 클래스가 바뀐다고 하여도 객첼르 담을 변수의 타입은 변경할
		// 필요가 없다.
		HelloWorld hello = new HelloWorldKo();
					//= new HelloWorldEn();
					//= new HelloWorld();
		callMethod(hello);

	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
