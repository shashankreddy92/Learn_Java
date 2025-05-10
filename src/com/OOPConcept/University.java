package com.OOPConcept;

public class University {
	
	String u_name;
	
	public University(String u_name) {
		this.u_name = u_name ; 
	}
	
	public void conductingExams() {
		System.out.println(u_name +" is conducting java exam");
	}
	
	public void printUniDetails() {
		System.out.println("University name is: "+ u_name);
	}

}
