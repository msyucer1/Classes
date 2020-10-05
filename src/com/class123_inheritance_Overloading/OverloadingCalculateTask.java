package com.class123_inheritance_Overloading;

public class OverloadingCalculateTask {

	/*
	 * Create a class in which create a methods will calculate the area of square, rectangle, triangle and cube.
	 * Use seperate class to test your code.
	 */
	
	public void calculate (int a) {
		System.out.println("The area of square is: "+a*a);
	}
	
	public void calculate (int a, int b) {
		System.out.println("The area of rectangle is: "+a*b);
	}
	
	public void calculate ( int a, int b, int c) {
		System.out.println("The area of cube is: "+a*b*c);
	}
}
