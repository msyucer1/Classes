package com.class125_Final_TypeCasting;

public class Payment {

	public void makePayment() {
		System.out.println("We can make a payment with no fee");
	}
	
	public void closePayment () {
		System.out.println("All payments need to be closed.");
	}
}

class MasterCard extends Payment {
	public void makePayment() {
		System.out.println("We can make a payment with mastercard and 2% fees.");
	}
	
}

class VisaCard extends Payment {
	public void makePayment() {
		System.out.println("We can make a payment with mastercard and 5% fees.");
	}

	public void annualFee() {
		System.out.println("Visa card has annual fee");
	}
}