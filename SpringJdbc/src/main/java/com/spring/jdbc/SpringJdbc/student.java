package com.spring.jdbc.SpringJdbc;

public class student {
	
	private int stud_id;
	private String Name;
	private String City;
	
	@Override
	public String toString() {
		return "student [stud_id=" + stud_id + ", Name=" + Name + ", City=" + City + "]";
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public student(int stud_id, String name, String city) {
		super();
		this.stud_id = stud_id;
		Name = name;
		City = city;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
