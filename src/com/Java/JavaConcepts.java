package com.Java;

public class JavaConcepts {

	public static void main(String[] args) {
		
		//main method is void ---> never returns a value.
		
		JavaConcepts obj = new JavaConcepts();
		//one object will be created, obj is the reference variable, referring to this object.
		//after creating the object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qwe();
		System.out.println(s1);
		
		int x1 = obj.multiply(20, 40);
		System.out.println(x1);
		
	}
	
	//non-static methods
	
	//void--->does not return any value
	//return type--> void
	
	public void test() {//no input, no output	
		System.out.println("Test method");
	}
	
	//return type int
	public int pqr() { //no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;		
	}
	
	//return type String
	public String qwe() {
		System.out.println("QWE method");
		String s = "Java";
		return s;
	}
	
	//return type int
	//x,y-->input parameters/arguments
	public int multiply(int x, int y) {
		System.out.println("Multiplication method");
		
		int z = x * y;
		return z;
		
	}
	

}
