package com.springcore.usingbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/usingbean/beanconfig.xml");
		usingBean bean = (usingBean) context.getBean("bean");
		System.out.println(bean);
	}
}