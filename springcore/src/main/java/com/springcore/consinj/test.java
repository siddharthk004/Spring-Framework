package com.springcore.consinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/consinj/CIconfig.xml");
		person person1 = (person) context.getBean("person");
		System.out.println(person1);
		
	}

}
