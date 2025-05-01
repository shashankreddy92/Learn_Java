package com.Java;

public class CallbyValueAndCallByRef {

	int p, q;

	public static void main(String[] args) {

		CallbyValueAndCallByRef obj = new CallbyValueAndCallByRef();
		int x = 20;
		int y = 30;
		int z = obj.testSum(x, y); // call by value or pass by value
		System.out.println("SUM is:" + z);

		// before swapping
		obj.p = 30;
		obj.q = 50;
		System.out.println("Before swapping");
		System.out.println("p=" + obj.p);
		System.out.println("q=" + obj.q);

		obj.swap(obj);
		//after swapping
		System.out.println("after swapping");
		System.out.println("New value of p is :" + "p=" + obj.p);
		System.out.println("New Value of q is :" + "q=" + obj.q);
	}

	public int testSum(int a, int b) {

		int c = a + b;
		return c;

	}

	// call by reference
	public void swap(CallbyValueAndCallByRef t) {
		int temp;
		temp = t.p;// temp = 30
		t.p = t.q;// t.p=50
		t.q = temp;// t.q=30

	}

}
