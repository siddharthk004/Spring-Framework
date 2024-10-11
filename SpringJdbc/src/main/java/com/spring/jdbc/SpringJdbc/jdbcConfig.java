package com.spring.jdbc.SpringJdbc;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import com.spring.jdbc.SpringJdbc.dao.StudentDaoImplement;
//import com.spring.jdbc.SpringJdbc.dao.studentDao;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.SpringJdbc.dao"})
public class jdbcConfig {
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Siddhu@123");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;		
	}
	
//	@Bean("studentDao")
//	public studentDao getStudentDao() {
//		StudentDaoImplement studentDao = new StudentDaoImplement();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;		
//	}
	
}
