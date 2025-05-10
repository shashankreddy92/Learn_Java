package com.OOPConcept;

public class Department extends College {

	String d_name;
	
	public Department(String u_name,String c_name,String d_name){
		super(u_name,c_name);
		this.d_name = d_name;
	}
	
	public void conductingEvents() {
		System.out.println(d_name + " is conducting Freshers day");
	}
	
	public void printDeptDetails() {
		System.out.println("University name: " + u_name);
		System.out.println("College name: " + c_name);
		System.out.println("Department name: " + d_name);
	}
	
}
