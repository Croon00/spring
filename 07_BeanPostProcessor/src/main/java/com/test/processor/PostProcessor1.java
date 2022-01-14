package com.test.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor1 implements BeanPostProcessor {

	
	// 아래 있는 두 메서드 모두 첫 번째 매개변수에는 bean 객체가 들어오고
	// 두 번째 매개변수에는 bean의 이름(id)이 들어온다.
	// init-method가 호출되기 전에 호출된다.
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Processor1 before");
		// 두 번째 매개변수로 bean의 이름이 들어온다.
		// 이를 이용하여 bean별로 동작해야하는 코드를 구현해서 사용할 수 있다.
		if(beanName.equals("t1")) {
			System.out.println("id가 t1인 객체");
		}
		else if(beanName.equals("t2")) {
			System.out.println("id가 t2인 객체");
		}
		return bean;
	}
	
	// init-method가 호출된 이후에 호출된다.
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Processor1 after");
		return bean;
	}
	
}
