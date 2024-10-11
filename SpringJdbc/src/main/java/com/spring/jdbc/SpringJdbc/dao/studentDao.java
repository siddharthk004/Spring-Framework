package com.spring.jdbc.SpringJdbc.dao;

import java.util.List;

import com.spring.jdbc.SpringJdbc.entities.Student;

public interface studentDao {
	
	public int insert(Student student);

	public int change(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(int studentID);
	
	public List<Student> getAllStudent();
	
}
