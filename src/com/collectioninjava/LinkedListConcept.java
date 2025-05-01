package com.collectioninjava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		// add:
		ll.add("Sai");
		ll.add("Reddy");
		ll.add("Mallu");

		System.out.println("Values are: " + ll);

		// fetching from an index using get() method
		System.out.println(ll.get(0));

		// setting a value
		ll.set(1, "Shashank");

		ll.addFirst("QAEngineer");
		ll.addLast("Automation");

		System.out.println("New :" + ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println("Latest :" + ll);

		// remove element from an index position
		ll.remove(2);
		
		

		System.out.println("New values are :" + ll);
		
		ll.set(1, "Reddy");
		

		// printing all values of linked list
		
		System.out.println("*****using for loop");

		// for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("*****using advance for loop");

		for (String str : ll) {

			System.out.println(str);

		}

		// using iterator
		System.out.println("****USing Iterator");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("****Using while loop");

		//while loop
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
