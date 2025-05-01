package com.Java;

public class FinallyConcept {

	public static void main(String[] args) {
		// test1();
		// test2();
		division();

	}

	public static void test1() {
		try {

			System.out.println("inside test 1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("Inside catch  block");

		}

		finally {
			System.out.println("inside finall block");
		}
	}

	public static void test2() {
		try {
			System.out.println("inside test2 method");

		}

		finally {
			System.out.println("Finally code is executed");
		}
	}

	public static void division() {
		int i = 10;

		try {
			System.out.println("inside try block");
			int k = i / 0;
			
		} catch (NullPointerException e) {// if instead of Arithmetic exception there 
										//is any other exception it wont come inside catch block
			System.out.println("Inside catch block");
		} finally {
			System.out.println("execute the code even after exception");
		}

	}
}
