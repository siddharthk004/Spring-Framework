package com.springcore.lifecycle;

public class lifecyc {
	private double price;

	public lifecyc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "lifecyc [price=" + price + "]";
	}	
}
