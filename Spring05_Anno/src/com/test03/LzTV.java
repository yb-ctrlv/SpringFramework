package com.test03;

import org.springframework.stereotype.Component;

@Component
public class LzTV implements TV {

	public LzTV() {
		System.out.println("LzTV 생성!");
	}
	@Override
	public void powerOn() {
		System.out.println("Lz powerOn()");
	}

	@Override
	public void powerOff() {
		System.out.println("Lz powerOff()");
	}

	@Override
	public void volumeUp() {
		System.out.println("Lz volumeUp()");
	}

	@Override
	public void volumeDown() {
		System.out.println("Lz volumeDown()");
	}

}
