package com.class125_Final_TypeCasting;

public class PaymentTest {

	public static void main(String[] args) {
		Payment obj = new Payment();
		obj.makePayment();
		MasterCard obj1 = new MasterCard();
		obj1.makePayment();
		VisaCard obj2 = new VisaCard();
		obj2.makePayment();
		obj2.annualFee();
		
		// Achieving run time polymorphism
		// pay -- reference variable, Payment -- type;
		// new MasterCard(); -- creating an Object
			Payment Pay = new MasterCard();
		// Any method that exist in Parent and common in child.
			Pay.closePayment();
			Pay.makePayment();
		
		// When we gave reference to parent, if there is a common method (which placed in two class), 
		// when we call it, it comes from child class.
		// when we call unique class which placed in parent class it comes from there. 
		
	}
}
