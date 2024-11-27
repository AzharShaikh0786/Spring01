package com.tut.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/tut/constructor/Constructor.xml");
		Person per = (Person) context.getBean("Person");
		System.out.println(per);

	}

}
