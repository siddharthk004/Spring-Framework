package com.spring.jdbc.SpringJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.SpringJdbc.entities.Student;

public class StudentDaoImplement implements studentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbcTemplate = jdbctemplate;
	}

	public int change(Student student) {
		
		String query = "update student set name=?,city=? where stud_id = ?";
		int ret = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getStud_id());
		return ret;
	}
	
	public int insert(Student student) {
		
		String query = "insert into student(stud_id,name,city) values(?,?,?)";
		
		int ret = this.jdbcTemplate.update(query,student.getStud_id(),student.getName(),student.getCity());  
		
		return ret;
	}
	
}
