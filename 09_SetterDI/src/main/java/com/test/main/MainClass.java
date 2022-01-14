package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.DataBean;
import com.test.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		System.out.println("코드를 통해 객체 생성");
		
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		
		TestBean1 t1 = new TestBean1();
		t1.setData1(100);
		t1.setData2(11.11);
		t1.setData3(true);
		t1.setData4("문자열1");
		t1.setData5(d1);
		t1.setData6(d2);

		
		System.out.println(t1.getData1());
		System.out.println(t1.getData2());
		System.out.println(t1.isData3());
		System.out.println(t1.getData4());
		System.out.println(t1.getData5());
		System.out.println(t1.getData6());
		
		System.out.println("======================================");
		
		System.out.println("정의 되어있는 bean을 추출한다");
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		System.out.println(obj1.isData3());
		System.out.println(obj1.getData4());
		System.out.println(obj1.getData5());
		System.out.println(obj1.getData6());
		
		ctx.close();
	}

}
