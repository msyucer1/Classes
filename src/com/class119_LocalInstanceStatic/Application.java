package com.class119_LocalInstanceStatic;

public class Application {

	public static void main(String[] args) {
		
		int []my_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Printing the minimum value");
		System.out.println(Minimum.minOfValues(my_array));
		
		int [] x1 = {25,45,73,95,36,12,75,99,88,41,44,12};
		System.out.println(Minimum.MaxOfValues(x1));
		
		Calculator x = new Calculator();
		System.out.println(x.sum(25,30,45));
		System.out.println(x.average(25,30,45));
		System.out.println(x.max(25,30,45));
		System.out.println(x.min(25,30,45));
	}

}
