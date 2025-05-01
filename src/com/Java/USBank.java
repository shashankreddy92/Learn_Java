package com.Java;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration(no method body--only method prototype)
	//In Interface, we can declare vars,vars by default are static in nature
	//variables value will not be changed
	//no static method in Interface
	//no main method in Interface
	//Interface are abstract in nature, can not create object of Interface.

}
