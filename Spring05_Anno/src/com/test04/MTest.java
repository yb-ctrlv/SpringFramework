package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	// TODO : 004.service 객체의 addUSer 호출
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		UserServiceImpl user = (UserServiceImpl) factory.getBean("user");
		user.adduser();
	}

}
