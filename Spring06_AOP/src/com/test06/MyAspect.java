package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(public * *(..))")
	public void myClass() {}
	
	@Before("myClass()")
	public void before() {
		System.out.println("출석 카드 찍는다");
	}
	
	@After("myClass()")
	public void after() {
		System.out.println("집에 간다.");
	}
	
}
