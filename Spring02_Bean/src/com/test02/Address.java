package com.test02;

public class Address {

	private String name;
	private String addr;
	private String tel;
	
	public Address() {
		super();
	}
	
	public Address(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
	@Override
	public String toString() {
		return "name = "+ name +", addr = "+ addr + ", tel = "+ tel;
	}
	
}
