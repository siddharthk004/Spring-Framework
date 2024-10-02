package com.springcore.bean.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Siddharth Kardile")
	private String studentName;
	@Value("Pune-City")
	private String city;
	@Value("#{3 > 4 ? 10 : 20}")
	private int n;
	
	public Student(String studentName, String city, int n) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", n=" + n + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
