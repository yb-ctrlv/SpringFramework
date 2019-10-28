package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		Developer kang = (Developer) factory.getBean("kang");
		Engineer you = (Engineer) factory.getBean("you");
		
		System.out.println(you);
		System.out.println(kang);
	}

}
