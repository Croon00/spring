package com.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.DataBean;
import com.test.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t1 = new TestBean();
		
		// 문자열 객체를 담을 ArrayList 생성
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("문자열1");
		list1.add("문자열2");
		list1.add("문자열3");
		// ArrayList를 TestBean의 list 변수에 담는다.
		t1.setList1(list1);
		
		// list1에 담긴 객체를 추출하여 하나씩 출력한다.
		for (String a1 : t1.getList1()) {
			System.out.println(a1);
		}
		// 정수 객체를 담을 ArrayList를 생성한다.
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// 리스트에 정수값을 담는다.
		list2.add(100);
		list2.add(200);
		list2.add(300);
		// ArrayList를 TestBean의 list2 변수에 담는다.
		t1.setList2(list2);
		
		for (int a2 : t1.getList2()) {
			System.out.println(a2);
		}
		
		// 리스트에 담을 객체를 생성한다.
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		
		// 객체를 담을 리스트를 생성한다.
		ArrayList<DataBean> list3 = new ArrayList<DataBean>();
		list3.add(d1);
		list3.add(d2);
		// 리스트를 TestBean 객체의 list3에 넣어준다.
		t1.setList3(list3);
		for (DataBean a3 : t1.getList3()) {
			System.out.println(a3);
		}
		
		// 문자열을 담을 Set을 생성한다.
		HashSet<String> set1 = new HashSet<String>();
		set1.add("문자열1");
		set1.add("문자열2");
		set1.add("문자열3");
		set1.add("문자열1");
		set1.add("문자열1");
		
		// Set을 TestBean의 set1에 담는다.
		t1.setSet1(set1);
		
		for (String a1 : set1) {
			System.out.println(a1);
		}
		
		// 정수 값을 담을 set을 생성한다.
		HashSet<Integer> set2 = new HashSet<Integer>();
		// 정수값을 담는다.
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(100);
		set2.add(100);
		// TestBean의 set2에 담는다
		t1.setSet2(set2);
		
		for (int a5 : t1.getSet2()) {
			System.out.println(a5);
		}
		
		HashSet<DataBean> set3 = new HashSet<DataBean>();
		// set에 객체를 담는다.
		DataBean d3 = new DataBean();
		DataBean d4 = new DataBean();
		DataBean d5 = new DataBean();
		
		// 같은 객체를 set에 두번 담는다.
		set3.add(d3);
		set3.add(d3);
		
		// set은 같은 객체만 중복으로 취급한다.
		// 같은 클래스를 사용했다고 해도 서로 다른 객체는 중복으로
		// 취급하지 않는다.
		// 클래스는 같지만 서로 다른 객체를 담는다
		set3.add(d4);
		set3.add(d5);
		// TestBean의 set3에 담는다
		t1.setSet3(set3);
		
		for (DataBean a6 : t1.getSet3()) {
			System.out.println(a6);
		}
		
		HashMap<String, Object> map1 =new HashMap<String, Object>();
		map1.put("a1", 100);
		map1.put("a2", 11.11);
		map1.put("a3", true);
		map1.put("a4", "문자열");
		
		DataBean d10 = new DataBean();
		map1.put("a5", d10);
		
		// TestBean의 map1에 담는다.
		t1.setMap1(map1);
		
		// TestBean에서 HashMap을 추출한다.
		Map<String, Object> map2 = t1.getMap1();
		// 값을 가져온다.
		System.out.println("a1");
		System.out.println("a2");
		System.out.println("a3");
		System.out.println("a4");
		System.out.println("a5");
		
		
		// TestBean에 담을 Properties를 생성한다
		// Properties는 문자열만 담을 수 있다.
		Properties prop = new Properties();
		prop.setProperty("p1", "문자열1");
		prop.setProperty("p2", "문자열2");
		prop.setProperty("p3", "문자열3");
		
		// TestBean에 담는다.
		t1.setProp1(prop);
		
		// 값을 가져온다.
		Properties prop2 = t1.getProp1();
		System.out.println(prop2.getProperty("p1"));
		System.out.println(prop2.getProperty("p2"));
		System.out.println(prop2.getProperty("p3"));
		
		System.out.println("====================================");
		
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		
		for (String a1 : obj1.getList1()) {
			System.out.println(a1);
		}
		
		for (Integer a2 : obj1.getList2()) {
			System.out.println(a2);
		}
		
		for (DataBean a3 : obj1.getList3()) {
			System.out.println(a3);
		}
		
		for (String a4 : obj1.getSet1()) {
			System.out.println(a4);
		}
		
		for (int a5 : obj1.getSet2()) {
			System.out.println(a5);
		}
		
		for (DataBean a6 : obj1.getSet3()) {
			System.out.println(a6);
		}
		
		// TestBean에서 HashMap을 추출한다.
		Map<String, Object> map3 = t1.getMap1();
		// 값을 가져온다.
		System.out.println(map3.get("a1"));
		System.out.println(map3.get("a2"));
		System.out.println(map3.get("a3"));
		System.out.println(map3.get("a4"));
		System.out.println(map3.get("a5"));
		
		// TestBean에서 Properties를 추출한다.
		Properties prop3 = obj1.getProp1();
		System.out.println(prop3.getProperty("p1"));
		System.out.println(prop3.getProperty("p2"));
		System.out.println(prop3.getProperty("p3"));
		ctx.close();
	}

}
