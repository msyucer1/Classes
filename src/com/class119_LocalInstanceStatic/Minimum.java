package com.class119_LocalInstanceStatic;

public class Minimum {

	/*
	 * Create a class Called Minimum within it crate a method called minOfValues
	 * make it static
	 * From your previous Applications class call the method and pass an array argument
	 * and print out the result
	 */
	
	static int minOfValues(int [] array) {
		int minimum = array [0] ;
		for (int a : array) {
			if(a < minimum) {
				minimum = a;
			}
		}
		return minimum;
	}
	
	static int MaxOfValues (int [] y) {
		int max = y[0];
		
		for (int Array : y) {
			if (Array > max) {
				max = Array;
			}
		}
		return max;
	}
	
}

