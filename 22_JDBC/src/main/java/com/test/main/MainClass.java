package com.test.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.beans.JdbcBean;
import com.test.config.BeanConfigClass;
import com.test.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
//		
		// dao를 가져온다
	    JdbcDAO dao = ctx2.getBean(JdbcDAO.class);
	
//		 //insert
//		JdbcBean bean1 = ctx2.getBean(JdbcBean.class);
//		bean1.setInt_data(1);
//		bean1.setStr_data("문자열1");
//		dao.insert_data(bean1);
//		
//		JdbcBean bean2 = ctx2.getBean(JdbcBean.class);
//		bean2.setInt_data(2);
//		bean2.setStr_data("문자열2");
//		dao.insert_data(bean2);
		
//		//update
//		JdbcBean bean4 = ctx2.getBean(JdbcBean.class);
//		bean4.setInt_data(1);
//		bean4.setStr_data("문자열3");
//		dao.update_data(bean4);
		
		//delete
		dao.delete_data(1);
		
		
		//select
		List<JdbcBean> list = dao.select_data();
		
		for(JdbcBean bean3 : list) {
			System.out.println("int_data : " + bean3.getInt_data());
			System.out.println("str_data : " + bean3.getStr_data());
			System.out.println("-----------------------------------");
		}
		
		ctx2.close();
		
		
	}

}
