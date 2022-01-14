package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans2.TestBean3;
import com.test.beans2.TestBean4;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 3가지의 경우 모두 테스트
		// 이름이 없는 bean
		// benas.xml에 정의한 bean
		TestBean1 xml1 = ctx.getBean(TestBean1.class);
		System.out.println("xml1 :" + xml1);
		
		// BeanConfigClass에 정의한 bean
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.println("java1 :" + java1);
		
		// 클래스에 어노테이션으로 정의한 bean
		TestBean2 com1 = ctx.getBean(TestBean2.class);
		System.out.println("com1 :" + com1);
		
		TestBean2 com2 = ctx2.getBean(TestBean2.class);
		System.out.println("com2 :" + com2);
		
		// 이름이 있는 bean
		// beans.xml에 정의한 bean
		TestBean3 xml100 = ctx.getBean(TestBean3.class);
		System.out.println("xml100: " + xml100);
		
		// BeanConfiguration 파일에 정의한 bean
		TestBean3 java100 = ctx2.getBean("java100", TestBean3.class);
		System.out.println("java100 :" + java100);
		
		// 클래스에 어노테이션으로 이름을 설정한 bean
		TestBean4 com100 = ctx.getBean("com100", TestBean4.class);
		System.out.println("com100 :" + com100);
		
		TestBean4 com200 = ctx2.getBean("com100", TestBean4.class);
		System.out.println("com200 :" + com200);
		ctx.close();
		ctx2.close();
	}

}
