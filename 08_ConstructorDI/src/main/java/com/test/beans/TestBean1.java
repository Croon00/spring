package com.test.beans;

public class TestBean1 {

	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
		this.data1=0;
		this.data2=0.0;
		this.data3=null;
	}
	
	public TestBean1(int data1) {
		System.out.println("TestBean1의 생성자 : int 변수 1개");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean1(double data2) {
		System.out.println("TestBean1의 생성자 : double 변수 1개");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	
	public TestBean1(String data3) {
		System.out.println("TestBean1의 생성자 : String 변수 1개");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = data3;
	}
	
	public TestBean1(int data1, double data2, String data3) {
		System.out.println("TestBean1의 생성자 : 매개변수 3개");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	public void showData() {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
	}
	
}
