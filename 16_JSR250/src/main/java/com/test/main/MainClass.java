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
		
		ctx.close();
		
		System.out.println("=================================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ctx2.getBean("obj1",TestBean1.class);
		System.out.println(t1);
		
		System.out.println("-----------------------------------------------------------------");
		
		TestBean2 t2 = ctx2.getBean("obj2",TestBean2.class);
		System.out.println(t2);
		
		System.out.println("-----------------------------------------------------------------");
		
		TestBean3 t3 = ctx2.getBean("obj3",TestBean3.class);
		System.out.println(t3.getData1());
		System.out.println(t3.getData2());
		System.out.println(t3.getData_bean1());
		System.out.println(t3.getData_bean2());
		ctx2.close();
	}

}
