package com.springcore.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotation {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public annotation(String Subject) {
		super();
		this.Subject = Subject;
	}

	@Override
	public String toString() {
		return "annotation [Subject=" + Subject + "]";
	}
	
	@PostConstruct
	public void Start()
	{
		System.out.println("Hello I`m Start");
	}
	
	@PreDestroy
	public void End()
	{
		System.out.println("Bye I`m End");
	}
}
