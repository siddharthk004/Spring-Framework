package com.spring.jdbc.SpringJdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.SpringJdbc.dao.studentDao;
import com.spring.jdbc.SpringJdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);

    	studentDao studentDao = context.getBean("studentDao",studentDao.class);
    	
    	Student student = new Student();
    	
//    	  insert values  
    	student.setStud_id(6);
    	student.setName("john");
    	student.setCity("London");
    	int results = studentDao.insert(student);
    	System.out.println("Student Added : "+results);
    	 

    	//  Update values
//    	student.setStud_id(4);
//    	student.setName("Pranali");
//    	student.setCity("Nashik");
//    	int result = studentDao.change(student);
//    	System.out.println("Student Data Updated: "+result);
    	
    	
//    	  delete Values
//    	student.setStud_id(7);
//    	int result0 = studentDao.delete(student);
//    	student.setStud_id(8);
//    	int result1 = studentDao.delete(student);
//    	student.setStud_id(9);
//    	int result2 = studentDao.delete(student);
//    	student.setStud_id(10);
//    	int result3 = studentDao.delete(student);
    	
//    	System.out.println(result);
    	
    	//  select Values
//		Student result = studentDao.getStudent(5);
//    	System.out.println(result);
    	
    	List<Student> result = studentDao.getAllStudent();
    	for(Student s:result) {
    	System.out.println(s);
    	}
		
		
    	
    	//  insert values	
//    	JdbcTemplate std =context.getBean("jdbcTemplate",JdbcTemplate.class);
//    	String query = "insert into student(stud_id,name,city) values(?,?,?)";    	
//    	int result = std.update(query,5,"Rekha","Delhi");
//    	System.out.println("Number of Record Inserted : "+result); 
    
    }
}
