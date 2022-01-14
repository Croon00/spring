package com.test.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.TestBean;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;
import com.test.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {

		// IoC 컨테이너 생성
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// 클래스타입만 명시되어 있는 bean을 추출
		// 메서드에 클래스타입을 명시해준다.
		// 추출한 bean은 명시된 클래스타입으로 형변환해서 반환한다.
		
		// 나는 이것을 딱 하나만 사용할 것이야 할 때 사용.
		TestBean bean1 = ctx.getBean(TestBean.class);
		System.out.println(bean1);
		
		// id가 설정되어 있는 bean을 추출한다.
		// Object --> 최상위 클래스 t1--> Object 타입으로 되어있기 때문에 형변환을 해주어서 해야한다.
		// 정의되어 있는 모든 bean 중에 id가 t1인 bean을 찾아
		// 반환해준다.
		// 이때, 반환 타입은 Object 타입이므로 형변환을 해줘야 한다.
		TestBean2 bean2 = (TestBean2)ctx.getBean("t1");
		System.out.println(bean2);
		
		// TestBean2 타입으로 정의된 bean 중에 id가 t2인 bean을 찾아 
		// 반환해준다.
		// 이때, 지정된 클래스타입으로 형변환해서 반환해 준다.
		TestBean2 bean3 = ctx.getBean("t2", TestBean2.class);
		System.out.println(bean3);
		
		// TestBean3은 lazy-init에 true가 설정되어 있어 IoC 컨테이너가
		// 생성될 때 객체가 생성되지 않는다.
		// 개발자가 getBean 메서드를 통해 객체를 추출할 때 생성된다.
		TestBean3 bean4 = ctx.getBean("t3", TestBean3.class);
		System.out.println(bean4);
		
		// 위의 3가지의 경우 모두 객체는 한 번만 생성되고
		// getBean 할 때마다 같은 객체가 추출된다.
		TestBean bean5 = ctx.getBean(TestBean.class);
		TestBean bean6 = ctx.getBean(TestBean.class);
		
		TestBean2 bean7 = ctx.getBean("t1",TestBean2.class);
		TestBean2 bean8 = ctx.getBean("t1",TestBean2.class);
		
		TestBean2 bean9 = ctx.getBean("t2",TestBean2.class);
		TestBean2 bean10 = ctx.getBean("t2",TestBean2.class);
		
		TestBean3 bean11 = ctx.getBean("t3",TestBean3.class);
		TestBean3 bean12 = ctx.getBean("t3",TestBean3.class);
		
		System.out.println("bean5 :" + bean5);
		System.out.println("bean6 :" + bean6);
		System.out.println("bean7 :" + bean7);
		System.out.println("bean8 :" + bean8);
		System.out.println("bean9 :" + bean9);
		System.out.println("bean10 :" + bean10);
		System.out.println("bean11 :" + bean11);
		System.out.println("bean12 :" + bean12);
		
		// scope가 prototype인 bean 사용
		// IoC 컨테이너가 생성될 때 객체가 생성되지 않는다.
		// 그리고 getBean 메서드를 호출할 때마다 새로운 객체를 생성한다
		TestBean4 bean13 = ctx.getBean("t4",TestBean4.class);
		TestBean4 bean14 = ctx.getBean("t4",TestBean4.class);
		
		System.out.println("bean13 =" + bean13);
		System.out.println("bean14 =" + bean14);
		ctx.close();
	}

}
