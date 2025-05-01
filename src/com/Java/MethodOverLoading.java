package com.Java;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		obj.sum(12);
		obj.sum(10, 13);
		
	}
	
	//one cant create a method inside a method	
	//duplicate methods--> same method name with same number of arguments is not allowed
	//main method can be overloaded with different params
	
	//method overloading---> when the method name is same with different parameters/arguments within the same class
	public void sum() {//sum method with 0 input parameters
		System.out.println("SUM method---0 input param");
	}
	
	public void sum(int x) {//1 input param
		System.out.println("sum method ---1 input param");
		System.out.println(x);
	}
	
	public void sum(int l, int k) {//2 input params
		System.out.println("SuM method ---2 input params");
		System.out.println(l+k);
		
	}

}
