package com.test.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

// Advisor
// Advice : 원래 호출될 메서드가 호출되기 전이나 후에 동작할
// 메서드를 의미한다.
public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	// 매개 변수로 aop 기능을 통제하는 객체가 들어온다.
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 1");
		
		// 관심사로 등록된 메서드가 호출될 수 있도록 해준다
		// 이 시점에서 method1이 호출된다.
		Object obj = pjp.proceed();
		
		System.out.println("around 2");
		
		
		return obj;
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
}
