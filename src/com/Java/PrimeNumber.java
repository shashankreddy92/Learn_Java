package com.Java;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		// edge case
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter a number:"); 
		 * int num = scanner.nextInt();
		 * 
		 * if (isPrimeNumber(num)) { System.out.println(num + " is a Prime number."); }
		 * else { System.out.println(num + " is NOT a Prime number."); }
		 * scanner.close();
		 */
		
		getPrimeNumbers(15);

		
		/*
		 * System.out.println("1 is a prime number:" + isPrimeNumber(1));
		 * System.out.println("2 is a prime number:" + isPrimeNumber(2));
		 * System.out.println("3 is a prime number:" + isPrimeNumber(3));
		 * System.out.println("4 is a prime number:" + isPrimeNumber(4));
		 */
		  
		 

	}

}
