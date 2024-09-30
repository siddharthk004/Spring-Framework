package com.springcore.Auto.Wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
