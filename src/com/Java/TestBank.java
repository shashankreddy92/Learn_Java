package com.Java;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		//dynamic polymorphism: child class object can be referred by parent Interface reference var.
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	
	}

}
