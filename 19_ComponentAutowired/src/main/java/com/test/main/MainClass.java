package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ctx2.getBean("t1",TestBean1.class);

		System.out.println(t1.getData1());
		System.out.println(t1.getData2());
		System.out.println(t1.getData3());
		ctx2.close();
	}

}
