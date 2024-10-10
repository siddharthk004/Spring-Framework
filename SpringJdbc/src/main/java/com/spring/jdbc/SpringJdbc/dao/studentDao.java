package com.spring.jdbc.SpringJdbc.dao;

import com.spring.jdbc.SpringJdbc.entities.Student;

public interface studentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
}
