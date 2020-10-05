package com.class128_Abstraction_Interface;

public interface Bank {
	
	static String make = "bank"; //inside the interface all variables are public static final 
	void hasChecking();
	void hasSavings();
	void hasCreditCard();
//	static voud hasLoan(); we can not create it because we can not override it.
	String Hello = " hi";	//	We cannot have instance members(variables and methods)
	
	
}

class BOA implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different credit cards");
	}
}

class PNC implements Bank {

	public void hasChecking() {
		System.out.println("PNC has 1 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 3 different credit cards");
	}
}