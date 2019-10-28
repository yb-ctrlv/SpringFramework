package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.anno.MyNickName;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/anno/beans.xml");
		MyNickName nick = (MyNickName) factory.getBean("myNickName");
		System.out.println(nick);
	}

}
