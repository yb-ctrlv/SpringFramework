package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Person m = (Person) factory.getBean("man");
		Person w = (Person) factory.getBean("woman");
		
		System.out.println("남자입장");
		m.classWork();
		System.out.println("=--=-=-=");
		System.out.println("여자입장");
		w.classWork();
	}

}
