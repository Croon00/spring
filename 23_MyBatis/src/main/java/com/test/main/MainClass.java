package com.test.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.JdbcBean;
import com.test.config.BeanConfigClass;
import com.test.db.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		// mapper를 추출한다.
		MapperInterface mapper = ctx2.getBean("test_mapper", MapperInterface.class);
		
		// insert
//		JdbcBean bean2 = ctx2.getBean(JdbcBean.class);
//		bean2.setInt_data(100);
//		bean2.setStr_data("문자열100");
//		mapper.insert_data(bean2);
//		
//		JdbcBean bean3 = ctx2.getBean(JdbcBean.class);
//		bean3.setInt_data(200);
//		bean3.setStr_data("문자열200");
//		mapper.insert_data(bean3);
		
		
		//update
//		JdbcBean bean4 = ctx2.getBean(JdbcBean.class);
//		bean4.setInt_data(100);
//		bean4.setStr_data("문자열300");
//		mapper.update_data(bean4);
		
		
		// delete
		mapper.delete_data(100);
		
		// select
		List<JdbcBean> list1 = mapper.select_data();
		
		for(JdbcBean bean1 : list1) {
			System.out.println("int_data : " + bean1.getInt_data());
			System.out.println("str_data : " + bean1.getStr_data());
			System.out.println("-----------------------------------");
		}
		ctx2.close();
	}

}
