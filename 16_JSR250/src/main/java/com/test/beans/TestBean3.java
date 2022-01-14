package com.test.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean3 {
	
	// 이름을 통한 자동 주입 예제
	
	// Spring에서 제공하는 Annotation 사용
	
	// Spring에서 제공하는 Annotation 사용
	// Qualifier에 등록된 문자열과 동일한 이름으로
	// 등록되어 있는 bean을 찾아 주입한다.
	@Autowired
	@Qualifier("data_bean1")
	private DataBean1 data1;
	
	@Autowired
	@Qualifier("data_bean2")
	private DataBean2 data2;
	
	
	// JSR250에서 제공하는 Annotation 사용
	// 변수의 이름과 동일한 이름으로 등록되어 있는
	// bean을 찾아 주입한다.
	@Resource
	private DataBean1 data_bean1;
	
	@Resource
	private DataBean2 data_bean2;
	
	
	// 만약 변수의 이름과 다른 이름으로 등록된
	// bean을 주입하겠다면 이름을 직접 설정해준다.
	@Resource(name = "data_bean1")
	private DataBean1 data100;
	
	@Resource(name = "data_bean2")
	private DataBean2 data200;
	public DataBean1 getData1() {
		return data1;
	}
	
	public DataBean2 getData2() {
		return data2;
	}
	
	public DataBean1 getData_bean1() {
		return data_bean1;
	}
	
	public DataBean2 getData_bean2() {
		return data_bean2;
	}
	
	public DataBean1 getData100() {
		return data100;
	}
	
	public DataBean2 getData200() {
		return data200;
	}
	
	
}
