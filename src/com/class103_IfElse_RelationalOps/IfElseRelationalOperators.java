package com.class103_IfElse_RelationalOps;

public class IfElseRelationalOperators {

	public static void main(String[] args) {

		// <, >, >=, <=, ==, !=;
		
		int a = 19;
		int b = 10;
		
		boolean result = (a>b);
		boolean result1 = a==b;
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b ---> print
		System.out.println("-----------------------------------------------------------------");
		if (a>b){
			System.out.println("a is larger than b");
		}
		
		else {
			System.out.println("b is larger than a");
		}
		System.out.println("-----------------------------------------------------------------");
		
//		b=20;
//		
//		if (a>b) {
//			System.out.println("a is larger than b");	// it didn't write it cuz b>a.
//						
//		}
		
		int c = 0;
		int k = c;
		
		if (k==c) {
			System.out.println("it equals to each other");
		
		}
		else { System.out.println("these are different numbers");
		}
		System.out.println("-----------------------------------------------------------------");		
		
		if (k!=c) {
			System.out.println("it equals to each other");
		
		}
		else { System.out.println("these are different numbers");
		}
		System.out.println("-----------------------------------------------------------------");
		
		// declare price nd if price is higher tha expected price ---> i will not buy.
		double shoePrice = 29.99;
		double allowedPrice = 31.99;
		
		if (shoePrice<=allowedPrice) {
			System.out.println("I'm buying those shoes");
		}
		else {
			System.out.println("I'm not buying those shoes");
		}
		System.out.println("-----------------------------------------------------------------");
		
		shoePrice = 33.99;
		if (shoePrice<=allowedPrice) {
			System.out.println("I'm buying those shoes");
		}
		else {
			System.out.println("I'm not buying those shoes");
		}

		System.out.println("I continue to coding");
		
		
		
	}

}
