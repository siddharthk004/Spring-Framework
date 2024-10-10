package com.spring.jdbc.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.SpringJdbc.entities.Student;

public class rowMapperImpl implements RowMapper<Student>{


	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student object = new Student();
		object.setStud_id(rs.getInt(1));
		object.setName(rs.getString(2));
		object.setCity(rs.getString(3));
		return object;
	}

}
