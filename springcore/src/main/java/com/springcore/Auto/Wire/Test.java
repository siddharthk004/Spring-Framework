package com.springcore.Auto.Wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Auto/Wire/autoconfig.xml");
		
		
		Employee emp = context.getBean("auto",Employee.class);
		System.out.println(emp);
	}
}