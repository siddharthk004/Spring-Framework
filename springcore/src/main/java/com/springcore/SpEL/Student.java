package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{ 4+2 }")
	private int x;
	
	@Value("#{new java.lang.String('Siddhath Kardile')}")
	private String name;
	
	@Value("#{4>3}")
	private boolean bool;

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	@Value("#{ 2+3 }")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	public void setZ(double z) {
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", name=" + name + ", bool=" + bool + ", pi=" + pi + ", y=" + y + ", z=" + z + "]";
	}
	
	

}