package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.DataBean;
import com.test.beans.TestBean1;
import com.test.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		System.out.println("=============================================");
		
		System.out.println("코드를 통한 객체 생성 (기본 생성자)");
		TestBean1 t1 = new TestBean1();
		t1.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기");
		TestBean1 obj1 = ctx.getBean("obj1",TestBean1.class);
		obj1.showData();
		
		System.out.println("=============================================");
		System.out.println("코드를 통한 객체 생성(int 변수 1개)");
		TestBean1 t2 = new TestBean1(100);
		t2.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기 (정수형 값 하나 주입)");
		TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
		obj2.showData();
		
		System.out.println("=============================================");
		System.out.println("코드를 통한 객체 생성(double 변수 1개)");
		TestBean1 t3 = new TestBean1(11.11);
		t3.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기(실수값 하나 주입)");
		TestBean1 obj3 = ctx.getBean("obj3", TestBean1.class);
		obj3.showData();
		
		System.out.println("=============================================");
		System.out.println("코드를 통한 객체 생성(String 변수 1개)");
		TestBean1 t4 = new TestBean1("안녕하세요");
		t4.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기(문자열 하나 주입)");
		TestBean1 obj4 = ctx.getBean("obj4", TestBean1.class);
		obj4.showData();
		
		System.out.println("=============================================");
		System.out.println("코드를 통한 객체 생성(매개 변수 3개)");
		TestBean1 t5 = new TestBean1(100, 11.11, "안녕하세요");
		t5.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기(값 3개 주입, 매개변수 순서와 일치)");
		TestBean1 obj5 = ctx.getBean("obj5", TestBean1.class);
		obj5.showData();
		
		System.out.println("=============================================");
		System.out.println("정의 되어있는 bean을 가져오기(값 3개 주입, 매개변수 순서와 일치)");
		TestBean1 obj6 = ctx.getBean("obj6", TestBean1.class);
		obj6.showData();
		
		System.out.println("=============================================");
		System.out.println("코드를 통한 객체 생성 : 객체 2개");
		DataBean d1 =new DataBean();
		DataBean d2 =new DataBean();
		TestBean2 t10 = new TestBean2(d1,d2);
		
		System.out.println("==============================================");
		System.out.println("정의 되어있는 bean을 가져오기(주입할 객체 직접 셋팅)");
		TestBean2 obj10 = ctx.getBean("obj8", TestBean2.class);
		obj10.showData();
		
		System.out.println("==============================================");
		System.out.println("정의 되어있는 bean을 가져오기(bean의 id를 지정하여 주입)");
		TestBean2 obj20 = ctx.getBean("obj9", TestBean2.class);
		obj20.showData();
		ctx.close();
	}

}
