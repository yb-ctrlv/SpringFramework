package com.test01.anno;

import org.springframework.stereotype.Component;

// <bean id="nickName" class="com.test01.anno.NickName"/>
@Component
public class NickName {
	
	
	public NickName() {
		
	}
	
	public String toString() {
		return "Latte는 말이야";
	}

}
