package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");

		TestBean1 t1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println(t1.getData1());
		System.out.println(t1.getData2());
		System.out.println(t1.getData3());
		System.out.println(t1.getData4());
		System.out.println(t1.getData5());
		System.out.println(t1.getData6());
		System.out.println(t1.getData7());
		
		ctx.close();

		System.out.println("=================================================================");

		
		 AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		  
		  
		 TestBean1 java1 = ctx2.getBean("java1",TestBean1.class);
		 System.out.println(java1.getData1()); 
		 System.out.println(java1.getData2());
		 System.out.println(java1.getData3());
		 System.out.println(java1.getData4());
		 System.out.println(java1.getData5());
		 System.out.println(java1.getData6());
		 System.out.println(java1.getData7());
		 ctx2.close();
		 
	}

}
