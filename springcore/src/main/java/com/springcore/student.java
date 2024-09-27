package com.springcore;

public class student {
	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	
	public int getStudentId() {
//		System.out.println("Hii im a getter");
		return StudentId;
	}
	public void setStudentId(int studentId) {
//		System.out.println("Setting Student Id");
		this.StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
//		System.out.println("Setting Student Name");
		this.StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
//		System.out.println("Setting Student Address");
		this.StudentAddress = studentAddress;
	}
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int studentId, String studentName, String studentAddress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
}
