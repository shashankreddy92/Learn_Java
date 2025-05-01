package com.OOPConcept;

public class TestCar {

	public static void main(String[] args) {

		//static polymorphism--compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		b.refuel();
		b.engine();
		
		System.out.println("******");
		
		//Top Casting	
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		//BMW b1 = (BMW) new Car();
		
	}

}
