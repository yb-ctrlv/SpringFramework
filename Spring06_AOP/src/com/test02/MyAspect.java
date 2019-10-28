package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object returnVal = null;
		
		System.out.println("출석카드 찍는다.");
		try {
			//cc or (target)
			returnVal = invocation.proceed();
			
		} catch (Exception e) {
			System.out.println("쉬는 날이다.");
		} finally {
			System.out.println("집에간다.");
		}
		
		return returnVal;
	}

	
}
