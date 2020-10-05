package com.class104_NestedIf_Scanner;

public class IfElseExercises {

	public static void main(String[] args) {

		int k = -10;
		if (k>0) { 
			System.out.println("Your number is positive");
		}else {
			System.out.println("your number is negative");
		}
		System.out.println("-----------------------------------------------------------------");
		
		int m =360;
		if (m%3 == 0) {
			System.out.println("your number is 3 or exponent of 3");
		}else {
			System.out.println("your number different than 3 or it's exponents");
		}
		
		System.out.println("-----------------------------------------------------------------");
		int l = 10;
		if (l>18) {
			System.out.println("your number is bigger than 18");
		}else if (l == 18) { 
			System.out.println("your number is equals to 18");
		}else {
			System.out.println("your number is smaller than 18");
		}
		System.out.println("-----------------------------------------------------------------");
		
		boolean isReaning = false;
		if (isReaning==true) {
			System.out.println("Stay at home and study JAVA");
		}else {
			System.out.println("take a walk and do something fun");
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		
		
	}
	

}
