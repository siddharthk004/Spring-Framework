package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Xconfig.xml");
    	StudentDao student = context.getBean("studentDao",StudentDao.class);
//    	Student std = new Student(12,"Amruta Dahatonde","Ghodegaon");
//    	int r = student.insert(std);
//    	System.out.println("Done : "+r);
    	
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Press 1 for add new Student");
    	System.out.println("Press 2 for Display all Student");
    	System.out.println("Press 3 for get details of single Student");
    	System.out.println("Press 4 for Delete Student");
    	System.out.println("Press 5 for add update Student");
    	System.out.println("Press 6 for exit");
    }
}
