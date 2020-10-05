package com.class123_inheritance_Overloading;

public class OverLoadingMethods {
	
	//OVERLOADING METHODS BY CHANGING NUMBER OF PARAMETERS.
	public void add(int a) {
		System.out.println(a + a);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(double a, double b, double c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b) {
		System.out.println(b + a);
	}

	public void Substraction(double a, double b) {
		System.out.println(a - b);
	}

	public void Substraction(double k, int t) {
		System.out.println(k - t);
	}
	
	
	
	public static void main(String[] args) {
		
	OverLoadingMethods obj = new OverLoadingMethods();
	obj.add(45);
	obj.add(45 , 50);
	obj.add(45, 50);
	obj.add(55, 25, 30);
	obj.add(54, 16, 21);
	obj.Substraction(27, 17);
	obj.Substraction(57, 17);
	
	}
	
}
