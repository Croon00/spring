package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean1;
import com.test.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		System.out.println(t1);
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.println(t2);
		ctx.close();

	}

}
