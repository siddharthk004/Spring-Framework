package com.springcore.consinj;
import java.util.List;

public class person {
	private String name;
	private int personid;
	private certi cert;
	private List<String> list;
	
	public person(String name,int personid, certi cert, List<String> list)
	{
		this.name = name;
		this.personid = personid;
		this.cert = cert;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personid +"{"+this.cert.name+"}"+"\nList = "+this.list;
	}	
}
