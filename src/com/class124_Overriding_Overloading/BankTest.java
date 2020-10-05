package com.class124_Overriding_Overloading;

public class BankTest {

	public static void main(String[] args) {
		BankOfAmerica boa = new BankOfAmerica();
		BankPNC pnc = new BankPNC();
		BankWellsFargo bwf = new BankWellsFargo();
		BankCapitalOne bco = new BankCapitalOne();

		System.out.println("Bank charges interest rate = " + boa.chargeInterest());
		System.out.println("Bank charges interest rate = " + pnc.chargeInterest());
		System.out.println("Bank charges interest rate = " + bwf.chargeInterest());
		System.out.println("Bank charges interest rate = " + bco.chargeInterest());

		
		/**
		 * 	Method overloading is same method names within the same class.
		 * 	Method overriding is me method names within parent class and child classes. 
		 */
		
	}
}
