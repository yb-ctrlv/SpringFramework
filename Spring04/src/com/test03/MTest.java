package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		MyFoodMgr my = beans.getBean("myFood", MyFoodMgr.class);
		System.out.println(my);
	}

}
