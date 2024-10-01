package com.springcore.standalone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");

        Person person = context.getBean("person1",Person.class);
        System.out.println("----------");
        System.out.println(person);
        System.out.println("----------");
        System.out.println(person.getFriends1());
        System.out.println("----------");
        System.out.println(person.getFriends1().getClass().getName());
        System.out.println("----------");
        System.out.println(person.getFriends2());
        System.out.println("----------");
        System.out.println(person.getFriends2().getClass().getName());
        System.out.println("----------");
        System.out.println(person.getFriends3());
        System.out.println("----------");
        System.out.println(person.getFriends3().getClass().getName());
        System.out.println("----------");
      }
}
