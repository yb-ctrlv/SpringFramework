package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.anno.MyNickName;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		MyNickName nick = (MyNickName) factory.getBean("mynick");
		System.out.println(nick);
	}

}
