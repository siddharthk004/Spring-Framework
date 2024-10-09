package com.spring.jdbc.SpringJdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/SpringJdbc/config.xml");
    	JdbcTemplate std =context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	String query = "insert into student(stud_id,name,city) values(?,?,?)";
    	
    	int result = std.update(query,5,"Rekha","Delhi");
    	
    	System.out.println("Number of Record Inserted : "+result); 
    }
}
