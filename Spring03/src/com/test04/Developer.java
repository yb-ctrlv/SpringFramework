package com.test04;

public class Developer {

	private Emp emp;
	private String dept;
	
	public Developer() {}
	public Developer(Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
	}
	
	public String toString() {
		return emp + "\t 부서 : "+ dept + "(3팀)";
	}
}
