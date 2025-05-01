package com.Java;

import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {

		
		/*
		 * To take variables into an array from the user in Java, you typically use:
		 * 
		 * Scanner class for input
		 * 
		 * A loop to fill the array
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt(); // Size of array

		int arr[] = new int[n]; // Declare array

		System.out.println("Enter " + n + " integers:");

		// Take input into the array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Display the array
		System.out.println("Array elements:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
