package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

public class Student {
	private DepInj inj;
	public Student(DepInj inj) {
		super();
		this.inj = inj;
	}
	public DepInj getInj() {
		return inj;
	}
	public void setInj(DepInj inj) {
		this.inj = inj;
	}
	public void study()
	{
		this.inj.Display();
		System.out.println("Student is Reading a book");
	}
}
