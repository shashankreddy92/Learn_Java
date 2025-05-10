package com.OOPConcept;

public class College extends University{

	String c_name;
	
	public College(String u_name,String c_name){
		super(u_name);
		this.c_name = c_name;
	}
	
	public void teaching() {
		
		System.out.println(c_name+" is teaching SQL");
	}
	
	public void collegeDetails() {
		System.out.println("University name :"+ u_name);
		System.out.println("College name :"+c_name);
	}
}
