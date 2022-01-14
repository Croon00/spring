package com.test.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
// AOP 관련 설정을 하는 bean임을 명시한다.
@Aspect

public class AdvisorClass {

	// before
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	// around
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 1");
		
		// 관심사 메서드 호출
		Object obj = pjp.proceed();
		
		System.out.println("around 2");
		
		return obj;
	}
	
	// afterReturning
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("after returning");
	}
	
	// afterThrowing
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("after throwing");
	}
}
