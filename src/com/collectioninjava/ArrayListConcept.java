package com.collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3];// static array---size is fixed

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Values are:" + a[i]);
		}

		System.out.println("************");
		// dynamic array---ArrayList
		// 1.can contain duplicate value/element
		// 2.maintains insertion order
		// 3.Synchronized
		// 4.allows random access to fetch elements coz it starts the value on basis of
		// index

		ArrayList ar = new ArrayList();// non-generic
		ar.add(10);
		ar.add("SAI");
		ar.add('r');

		// to print all values from ArrayList
		// 1. for loop
		// 2. using iterator
		for (int i = 0; i < ar.size(); i++) {

			System.out.println("Values are:" + ar.get(i));

		}

		// non-generic vs generic

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("sai");
		ar1.add("der");

		Iterator<String> it1 = ar1.iterator();

		while (it1.hasNext()) {
			String int1 = it1.next();
			System.out.println("String values are:" + int1);

		}

		System.out.println("***************");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("Selenium");
		ar2.add("Test");

		Iterator<String> st1 = ar2.iterator();

		while (st1.hasNext()) {
			String st2 = st1.next();
			System.out.println("String value are:" + st2);
		}
		System.out.println("*****************");

		ArrayList<E> ar3 = new ArrayList<E>();

		ar3.add((E) "Hello");
		ar3.add((E) "World");

		Iterator<E> it2 = ar3.iterator();

		while (it2.hasNext()) {
			E it4 = it2.next();
			System.out.println("Values:" + it4);
		}

		// Employee Class Objects

		Employee e1 = new Employee(29, "Sai", "Admin");
		Employee e2 = new Employee(30, "Mallu", "Dev");
		Employee e3 = new Employee(31, "Reddy", "Tester");

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// Iterator to traverse the values

		Iterator<Employee> it = ar4.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println("Employees are: " + emp.age + "," + emp.name + "," + emp.dept);
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.dept);

		}

	}

}
