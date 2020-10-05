package com.class119_LocalInstanceStatic;

import java.util.Scanner;

public class Calculator {

	static int a, b,c;
	int sum = 0, average = 0;
	
	public static void main(String[] args) {

//	    Let’s create a class called Calculator
//		Have methods that take three inputs and return the result
//		and return the sum, average, min and max
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers: ");
		a = scan.nextInt();
		b = scan.nextInt(); 
		c = scan.nextInt();
		
	}	
	
	int sum (int a,int b,int c) {
		return a+b+c;
	}
	int average(int a,int b,int c) {
		 return (a+b+c)/3;
	}
	int max(int a,int b,int c) {
		int max = 0;
		if (a > b && a > c) {
			 max = a;
		}else if (b > a && b > c ) {
			max = b;
		}else {
			max = c;
		}
		return max;
	}
	int min(int a,int b,int c) {
		int min = a;
		if (a < b && a < c) {
			min = a;
		}else if (b < a && b < c ) {
			min = b;
		}else {
			min = c;
		}
		return min;
	}
}
