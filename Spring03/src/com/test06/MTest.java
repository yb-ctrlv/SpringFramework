package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/beans.xml");
		
		Developer you = (Developer) factory.getBean("you");
		Engineer kang = (Engineer) factory.getBean("kang");
		
		System.out.println(you);
		System.out.println(kang);
		
	}

}
