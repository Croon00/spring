package com.test.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;

public class TestBean1 {

	private int data1;
	private DataBean1 data2;
	
	// 자동 주입(타입) 설정을 변수에 한다.
	// 변수에 자동 주입을 설정하면 setter 메서드가
	// 자동으로 생성된다.
	@Autowired
	private DataBean1 data3;
	
	// 자동 주입(이름)
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	// @Autowired 의 required에 false를 넣어주면
	// 주입할 bean이 있다면 주입을 해주고
	// 주입할 bean이 없다면 오류가 발생하지 않고
	// null을 주입해준다.
	@Autowired(required = false)
	private DataBean3 data6;
	
	@Autowired(required = false)
	@Qualifier("obj100")
	private DataBean4 data7;
	
	public int getData1() {
		return data1;
	}
	
	
	// 필수 주입 프로퍼티(스프링 5.1 부터 혹은  Java 파일로 bean을 등록했을 경우 무시된다.)
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean1 getData2() {
		return data2;
	}
	
	// 자동 주입(타입)
	// 메서드의 매개변수 타입과 일치하는 클래스 타입의
	// bean을 자동 주입한다.
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}
	
	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}
	
	public DataBean3 getData6() {
		return data6;
	}
	
	public DataBean4 getData7() {
		return data7;
	}
	
	
}
