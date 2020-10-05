package com.class136_Exceptions_Throw;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
//		System.out.println(a/b); // new ArithmeticException();
		
//		if a person is >18 years old --> issue dr licence else -->> throw an exception
		
//		checkAgeEligibility(17);
//		twoNumDivision(30, 0);
		checkUserNameLength("Mhmt3");
		
		
	}
	
	public static void checkAgeEligibility(int Age) {
		if (Age >= 18) {
			System.out.println("Congratilations on your driver licence");
		}else {
			throw new ArithmeticException("You are not eligible to get licence");
		}
	}
	
	public static void twoNumDivision(int a, int b) {
		if (b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("You can not divide a number by zero");
		}
	}
	
	public static void checkUserNameLength(String Name) {
		if (Name.length()>6) {
			System.out.println("UserName is accepted");
		}else {
			throw new NullPointerException("UserName must be longer than 6 characters");
		}
	}
	
	
	
}
