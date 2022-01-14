package com.test.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;
import com.test.beans.DataBean3;
import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;

@Configuration
public class BeanConfigClass {


	@Bean
	public TestBean1 java1() {
		// JAVA로 bean을 설정할 때는
		// 주입의 개념이 개발자가 필요한 값들을 직접
		// 설정하는 것이다.
		DataBean1 d1 = new DataBean1();
		TestBean1 t1 = new TestBean1(100, "문자열", d1);
		
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		// Java로 bean을 설정하는 경우
		// setter를 통한 주입은
		// setter 메서드를 호출해 직접 값을
		// 넣어주는 것을 의미한다.
		DataBean1 d1 = new DataBean1();
		TestBean1 t1 = new TestBean1();
		t1.setData1(200);
		t1.setData2("문자열2");
		t1.setData3(d1);
		
		return t1;
	}
	
	// 이름을 통한 자동 주입을 위해 변수의 이름과
	// 동일한 이름의 메서드를 만들어주어야 한다.
	@Bean
	public DataBean2 data1() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
	@Bean
	public DataBean2 data2() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	// 타입을 통한 자동 주입
	// bean의 변수의 타입과 같은 타입을 반환하는
	// 메서드를 찾아 호출한다.
	// 동일 타입을 반환하는 메서드가 두 개 이상 있으면
	// 오류가 발생한다.
	
	@Bean
	public DataBean3 data123() {
		DataBean3 d3 = new DataBean3();
		return d3;
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
}
