package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		System.out.println(factory.hashCode());
		MessageBean apple = (MessageBean) factory.getBean("apple");
		apple.sayHello();
		System.out.println(apple.hashCode());
		MessageBean watermelon = (MessageBean) factory.getBean("watermelon");
		watermelon.sayHello();
		System.out.println(watermelon.hashCode());
		MessageBean jadu = ((MessageBean) factory.getBean("jadu"));
		jadu.sayHello();
		System.out.println(jadu.hashCode());
		((ClassPathXmlApplicationContext)factory).close();
	}
}
