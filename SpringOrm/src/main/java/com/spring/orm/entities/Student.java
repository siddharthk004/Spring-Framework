package com.spring.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@Column(name = "Student_id")
	private int s_id;
	@Column(name = "Student_name")
	private String s_name;
	@Column(name = "Student_city")
	private String s_city;
	public Student(int s_id, String s_name, String s_city) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_city = s_city;
	}
	public Student() {
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
}
