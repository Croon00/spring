package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean xml1 = ctx.getBean("xml1", TestBean.class);
		System.out.println(xml1);
		
		
		ctx.close();
		
		
		System.out.println("====================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean java1 = ctx2.getBean("java1", TestBean.class);
		System.out.println(java1);
		
		ctx2.close();
	}

}
