package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;
import com.test.beans.TestBean4;
import com.test.beans.TestBean5;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		System.out.println("------------------------------------------");
		
		TestBean1 t1 = ctx2.getBean(TestBean1.class);
		System.out.println("t1 :" + t1);
		
		TestBean1 t2 = ctx2.getBean(TestBean1.class);
		System.out.println("t2 :" + t2);
		
		System.out.println("=========================================");
		TestBean2 t3 = ctx2.getBean("t3", TestBean2.class);
		System.out.println("t3 :" + t3);
		
		TestBean2 t4 = ctx2.getBean("t3", TestBean2.class);
		System.out.println("t4 :" + t4);
		
		System.out.println("==========================================");
		TestBean3 t5 = ctx2.getBean("t5", TestBean3.class);
		System.out.println("t5 :" + t5);
		
		TestBean3 t6 = ctx2.getBean("t5", TestBean3.class);
		System.out.println("t6 :" + t6);
		
		System.out.println("==========================================");
		TestBean4 t7 = ctx2.getBean("t7", TestBean4.class);
		System.out.println("t7 :" + t7);
		
		TestBean4 t8 = ctx2.getBean("t7", TestBean4.class);
		System.out.println("t8 :" + t8);
	
		System.out.println("==========================================");
		TestBean5 t9 = ctx2.getBean("t9", TestBean5.class);
		System.out.println("t9 :" + t9);
		ctx2.close();
		
		
		
	}

}
