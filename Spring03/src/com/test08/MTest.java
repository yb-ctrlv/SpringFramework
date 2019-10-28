package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test08/applicationContext.xml");
		
		LzTV Lz = (LzTV) factory.getBean("lz");
		Lz.powerOn();
		Lz.powerOff();
		Lz.volumeUp();
		Lz.volumeDown();
		System.out.println("꺼내온후 생성!");
		SamsongTV Samsong = (SamsongTV) factory.getBean("samsong");
		
		
	}

}

