package com.test.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.test.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		// IoC : 제어 역전
		// 개발자가 작성하는 코드에서 객체를 생성하고 관리하는 부분을
		// 개발자가 하는 것이 아닌 프레임워크가 담당하는 것을 의미한다.
		
		// IoC 컨테이너
		// 프레임워크에서 생성하는 객체들을 담아 관리하는 요소.
		// 개발자는 IoC 컨테이너에 담긴 객체들을 필요할 때 마다 추출하여
		// 객체를 사용할 수 있다.

		System.out.println("Bean Facotry - 패키지 외부");
		
		// BeanFactory : IoC 컨테이너 객체를 생성할 때
		// bean들의 객체를 생성하지 않고 객체를 가져다 쓸때(getBean 호출)
		// 객체가 생성된다.
		
		// IoC 컨테이너 생성
		FileSystemResource res1 = new FileSystemResource("beans.xml");
		XmlBeanFactory factory1 = new XmlBeanFactory(res1);
		
		// 객체를 가지고 온다.
		TestBean bean1 = (TestBean)factory1.getBean("t1");
		System.out.println(bean1);
		
		TestBean bean2 = (TestBean)factory1.getBean("t1");
		System.out.println(bean2);
		
		System.out.println("===============================");
		
		System.out.println("Bean Factory - 패키지 내부");
		
		// IoC 컨테이너 -- 통제할 수 없다.
		ClassPathResource res2 = new ClassPathResource("com/test/config/beans.xml");
		XmlBeanFactory factory2 = new XmlBeanFactory(res2);
		
		TestBean bean3 = (TestBean)factory2.getBean("t2");
		System.out.println(bean3);
		
		TestBean bean4 = (TestBean)factory2.getBean("t2");
		System.out.println(bean4);
		
		System.out.println("===============================");
		
		// ApplicationContext 사용
		// ApplicationContext는 bean 생성 시점을 통제할 수 있고
		// 기타 다양한 기능들을 제공한다.
		
		// IoC 컨테이너가 생성될 때 객체가 생성되게 하거나 아니면 내가 필요할 때 생성할 수 있게 통제가능
		
		System.out.println("ApplicationContext - 패키지 외부");
		
		// IoC 컨테이너 생성
		FileSystemXmlApplicationContext ctx1 = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean bean5 = (TestBean)ctx1.getBean("t1");
		System.out.println(bean5);
		// 반드시 닫아주어야 함
		ctx1.close();
		
		System.out.println("===============================");
		
		System.out.println("ApplicationContext - 패키지 내부");
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/test/config/beans.xml");
		
		TestBean bean6 = (TestBean)ctx2.getBean("t2");
		System.out.println(bean6);
		
		ctx2.close();
	}

}
