package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;
import com.test.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println(t1);
		
		System.out.println("=============================");
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.println(t2);
		
		System.out.println("=============================");
		
		TestBean3 t3 = ctx.getBean("t3",TestBean3.class);
		System.out.println(t3);
		

		System.out.println("=============================");
		
		TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
		System.out.println(t4);
		
		System.out.println("=============================");
		
		TestBean4 t5 = ctx.getBean("t5", TestBean4.class);
		System.out.println(t5);
		ctx.close();
		// bean 자체의 메서드가 먼저 호출된다.
	}

}
