package com.tut.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringCfg.xml");
		Employee emp = (Employee) context.getBean("Employee");
		System.out.println(emp);
	}
}
