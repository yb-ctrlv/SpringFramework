package com.test02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {

	@Autowired
//	@Qualifier("lee") //type찾고 안되면 name
	@Resource(name="hong") // name먼저 찾고 안되면 type
	private Student person;
	
	private int grade;

	public School() {
		super();
	}

	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}

	public Student getPerson() {
		return person;
	}

	public void setPerson(Student person) {
		this.person = person;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "School [person=" + person + ", grade=" + grade + "]";
	}
	
	
}
