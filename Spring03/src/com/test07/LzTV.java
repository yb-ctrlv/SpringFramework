package com.test07;

public class LzTV implements TV{

	public LzTV() {
		System.out.println("Lz TV 생성!!");
	}
	@Override
	public void powerOn() {
		System.out.println("Lz TV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("Lz TV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("Lz TV Volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Lz TV Volume down");
	}

}
