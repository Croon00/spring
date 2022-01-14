package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {

		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// 자동 주입을 사용하지 않는 객체
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		
		System.out.println("=======================================");
		
		// 자동 주입(byName)을 사용한 객체
		TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		
		System.out.println("=======================================");

		// 자동 주입(byType)을 사용한 객체
		TestBean2 obj3 = ctx.getBean("obj3", TestBean2.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		
		System.out.println("=======================================");
		// 생성자를 통한 주입(자동 주입 X)
		TestBean3 obj5 = ctx.getBean("obj5", TestBean3.class);
		System.out.println(obj5.getData1());
		System.out.println(obj5.getData2());
		System.out.println(obj5.getData3());
		System.out.println(obj5.getData4());
		
		System.out.println("========================================");
		
		// 생성자를 통한 주입(자동 주입 O)
		TestBean3 obj6 = ctx.getBean("obj6", TestBean3.class);
		System.out.println(obj6.getData1());
		System.out.println(obj6.getData2());
		System.out.println(obj6.getData3());
		System.out.println(obj6.getData4());
		
		System.out.println("========================================");

		TestBean1 obj7 = ctx.getBean("obj7",TestBean1.class);
		System.out.println(obj7.getData1());
		System.out.println(obj7.getData2());
		
		TestBean1 obj8 = ctx.getBean("obj8", TestBean1.class);
		System.out.println(obj8.getData1());
		System.out.println(obj8.getData2());
		ctx.close();
	}

}
