package com.spring.jdbc.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

	public int delete(Student student) {
		String query = "delete from student where stud_id=?";
		int ret = this.jdbcTemplate.update(query,student.getStud_id());
		return ret;
	}

	public Student getStudent(int studentID) {
		
		String query = "Select * from student where stud_id = ?";

		Student queryobj = (Student) this.jdbcTemplate.queryForObject(query, new RowMapper<Object>() {
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student object = new Student();
				object.setStud_id(rs.getInt(1));
				object.setName(rs.getString(2));
				object.setCity(rs.getString(3));
				return object;
			}
		},studentID);
		
		return queryobj;
	}
	
}
