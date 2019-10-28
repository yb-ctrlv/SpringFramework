package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer you = (Developer) factory.getBean("Dyou");
		Engineer kang = (Engineer) factory.getBean("Dkang");
		
		System.out.println(you);
		System.out.println(kang);
	}

}
