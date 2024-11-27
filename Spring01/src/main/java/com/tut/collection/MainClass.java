package com.tut.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringCfg.xml");
		Student std = (Student) context.getBean("Student");
		System.out.print(std);
		
		
	}

}
