package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		
		BirthDto hoon = (BirthDto) factory.getBean("hoon");
		BirthDto kim = (BirthDto) factory.getBean("kim");
		
		System.out.println(hoon);
		System.out.println(kim);
	}
}
