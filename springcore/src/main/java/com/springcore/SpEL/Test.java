package com.springcore.SpEL;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpEL/spelconfig.xml");
		Student std = context.getBean("student",Student.class);
		System.out.println(std);
		System.out.println("---------------");
		System.out.println(std.getName());
		System.out.println(std.getX());
		System.out.println(std.getY());
		System.out.println(std.getPi());
		System.out.println(std.isBool());
		
//		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		
//		org.springframework.expression.Expression exp = temp.parseExpression("22+34");
//		System.out.println(exp.getValue());
	}
}