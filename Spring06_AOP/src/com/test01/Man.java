package com.test01;

public class Man {

	void classWork() {
		System.out.println("출석"); // ccc(공통 관심사항)
		
		try {
		System.out.println("컴퓨터 켜서 웹툰본다.");//cc (core concern)
		}catch(Exception e) {
			System.out.println("쉬는 날이다.");
		}finally {
			System.out.println("집에 간다.");
		}
	}
}
