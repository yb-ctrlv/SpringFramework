package com.test05;

public class Developer {

	private Emp emp;
	private String dept;
	
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Emp getEmp() {
		return emp;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String toString() {
		return emp.toString() + "\t 부서 : "+ dept;
	}
}
