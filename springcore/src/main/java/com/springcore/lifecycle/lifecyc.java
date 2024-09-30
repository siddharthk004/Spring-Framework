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
		System.out.println("Setting property prize");
		this.price = price;
	}

	@Override
	public String toString() {
		return "lifecyc [price=" + price + "]";
	}	
	
	public void Hey()
	{
		System.out.println("Initialization Method Access");
	}
	
	public void Bye()
	{
		System.out.println("Destroy Method Access");
	}
}
