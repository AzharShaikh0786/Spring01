package com.tut.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/tut/reference/ReferenceCfg.xml");
		AReference ref = (AReference) context.getBean("ARef");
		System.out.print(ref);

	}

}
