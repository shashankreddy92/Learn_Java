package com.Java;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default constructor");//as no parameters are passed
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param const");
		System.out.println("Value of i:"+i);
	}
	
	public ConstructorConcept(int k, int j) {
		System.out.println("Two params const");
		System.out.println("Value of k:"+k);
		System.out.println("Value of j:"+j);
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();//default  const is called
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);
		
	}

}
