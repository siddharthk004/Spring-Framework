package com.demopurpose;

public class purpose {
	private int id;
	private String name;
	private String Address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public purpose(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public purpose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "purpose [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
}
