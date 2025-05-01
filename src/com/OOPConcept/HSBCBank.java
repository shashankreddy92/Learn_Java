package com.OOPConcept;

public class HSBCBank implements USBank, BrazilBank {

	// is a class is implementing any Interface, then its mandatory to
	// define/override all methods of Interface.
	
	//overriding from USBank 
	public void credit() {
		System.out.println("hsbc--credit");
	}

	public void debit() {
		System.out.println("hsbc--debit");
	}

	public void transferMoney() {
		System.out.println("hsbc--transfer money");
	}

	
	//separate method of HSBC bank
	public void carLoan() {
		System.out.println("hsbc--car loan");
	}
	
	//brazil  bank method:overriding from Brazil Bank
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}

}
