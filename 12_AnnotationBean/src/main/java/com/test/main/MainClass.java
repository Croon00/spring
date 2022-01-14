package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("XML 사용");
		
		// xml을 통해 bean을 생성하는 IoC 컨테이너
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println(xml1);
		
		TestBean1 xml11 = ctx.getBean("xml1", TestBean1.class);
		System.out.println(xml11);
		
		System.out.println("---------------------------------------------");
		
		TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
		System.out.println(xml2);
		
		TestBean2 xml22 = ctx.getBean("xml2", TestBean2.class);
		System.out.println(xml22);
		
		System.out.println("---------------------------------------------");

		TestBean3 xml3 = ctx.getBean("xml3", TestBean3.class);
		System.out.println(xml3);
		
		TestBean3 xml33 = ctx.getBean("xml3", TestBean3.class);
		System.out.println(xml33);
		ctx.close();
		
		System.out.println("==============================================");
		
		
		System.out.println("Java 코드 사용");
		
		// java 코드를 통해 bean을 생성하는 IoC 컨테이너
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.println(java1);
		
		TestBean1 java11 = ctx2.getBean("java1",TestBean1.class);
		System.out.println(java11);
		
		System.out.println("---------------------------------------------");
		
		TestBean2 java2 = ctx2.getBean("java2",TestBean2.class);
		System.out.println(java2);
		
		TestBean2 java22 = ctx2.getBean("java2",TestBean2.class);
		System.out.println(java22);
		
		System.out.println("---------------------------------------------");
		
		TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
		System.out.println(java3);
		
		TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
		System.out.println(java33);
		ctx2.close();
	}

}
