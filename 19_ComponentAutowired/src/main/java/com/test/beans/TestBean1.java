package com.test.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {

	// 타입을 이용한 자동 주입
	// 정의되어 있는 bean 중 클래스타입이
	// DataBean1인 것을 찾아 주입해준다.
	// DataBean1에 @Component를 사용하였기 때문에
	// DataBean1 타입의 bean이 정의되어 있게된다.
		@Autowired
		private DataBean1 data1;
		
		// 이름을 통한 자동 주입
		// 정의되어 있는 bean중에 이름이 변수명과
		// 동일한 bean을 찾아 주입한다.
		// DataBean2의 이름을 data2로 설정하였기 때문에
		// 이 bean이 주입된다.
		@Autowired
		@Qualifier("data2")
		private DataBean2 data2;
		
		// JSR250
		@Resource(name = "data2")
		private DataBean2 data3;
		
		public DataBean1 getData1() {
			return data1;
		}
		
		public DataBean2 getData2() {
			return data2;
		}
		
		public DataBean2 getData3() {
			return data3;
		}
	// 이름을 통한 자동 주입
		

}
