package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;
import com.test.beans.TestBean1;
import com.test.beans.TestBean2;
import com.test.beans.TestBean3;

@Configuration
public class BeanConfigClass {

	// init 메서드와 destroy 메서드를 등록한다.
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public TestBean1 obj1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// 빈에 init과 destroy를 직접 셋팅한 bean
	@Bean
	@Lazy
	public TestBean2 obj2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	// 주입할 bean
	@Bean
	public DataBean1 data_bean1() {
		DataBean1 d1 = new DataBean1();
		return d1;
	}
	
	@Bean
	public DataBean2 data_bean2() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
	
	// 이름을 통한 자동 주입이 설정되어 있는 bean
	@Bean
	public TestBean3 obj3() {
		TestBean3 t1 = new TestBean3();
		return t1;
	}
}
