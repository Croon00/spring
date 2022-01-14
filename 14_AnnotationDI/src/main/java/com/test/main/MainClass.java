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

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println(xml1.getData1());
		System.out.println(xml1.getData2());
		System.out.println(xml1.getData3());
		
		System.out.println("-----------------------------------------------------------------");
		
		TestBean1 xml2 = ctx.getBean("xml2", TestBean1.class);
		System.out.println(xml2.getData1());
		System.out.println(xml2.getData2());
		System.out.println(xml2.getData3());
		
		System.out.println("-----------------------------------------------------------------");
		
		TestBean2 xml3 = ctx.getBean("xml3", TestBean2.class);
		System.out.println(xml3.getData1());
		System.out.println(xml3.getData2());
		
		System.out.println("-----------------------------------------------------------------");
		
		TestBean3 xml4 = ctx.getBean("xml4", TestBean3.class);
		System.out.println(xml4.getData1());
		System.out.println(xml4.getData2());
		ctx.close();
		
		System.out.println("=================================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.println(java1.getData1());
		System.out.println(java1.getData2());
		System.out.println(java1.getData3());
		
		System.out.println("-----------------------------------------------------------------");
		TestBean1 java2 = ctx2.getBean("java2", TestBean1.class);
		System.out.println(java2.getData1());
		System.out.println(java2.getData2());
		System.out.println(java2.getData3());
		
		
		System.out.println("-----------------------------------------------------------------");
		TestBean2 java3 = ctx2.getBean("java3", TestBean2.class);
		System.out.println(java3.getData1());
		System.out.println(java3.getData2());
		
		System.out.println("-----------------------------------------------------------------");
		TestBean3 java4 = ctx2.getBean("java4", TestBean3.class);
		System.out.println(java4.getData1());
		System.out.println(java4.getData2());
		ctx2.close();
	}

}
