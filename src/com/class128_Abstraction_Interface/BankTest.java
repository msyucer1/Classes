package com.class128_Abstraction_Interface;

public class BankTest {

	public static void main(String[] args) {
		Bank bankObj = new BOA();
		bankObj.hasChecking();
		bankObj.hasCreditCard();
		bankObj.hasSavings();
		
		Bank bankObj1= new PNC();
		bankObj1.hasChecking();
		bankObj1.hasCreditCard();
		bankObj1.hasSavings();
	}
}
