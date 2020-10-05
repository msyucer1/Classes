package com.class103_IfElse_RelationalOps;

public class Exercises {

	public static void main(String[] args) {

		int x = 10;
		double x1 = 11.1;
		short x2 = 123;
		float x4 = 23.5f;

		if (x > x1) {
			System.out.println("x is bigger than x1");

		} else {
			System.out.println("x is smaller than x1 or it is equal to x1");

		}

		if (x > x2) {
			System.out.println("x is bigger than x2");
		} else {
			System.out.println("x2 is bigger than x");
		}
		System.out.println("-----------------------------------------------------------------");

		// Create a Java program and name it Double Comparison.
		// Declare 2 double values and if value of first variable is higher then print
		// “Double value __ is larger than __ .” and vs.
		double x5 = 23.99;

		if (x1 > x5) {
			System.out.println("double value " + x1 + " is bigger than " + x5);
		} else {
			System.out.println("double value " + x1 + " is smaller than " + x5);
		}
		System.out.println("-----------------------------------------------------------------");

		// check the temperature
		int storeTemperature = 32;
		if (storeTemperature == 32) {
			System.out.println("we will freeze with temperature " + storeTemperature);
		} else {
			System.out.println("this temperature is good for us");
		}

		if (x4 <= storeTemperature) {
			System.out.println("WTF is that");
		} else {
			System.out.println("temperature is less than " + x4);
		}
		System.out.println("-----------------------------------------------------------------");

		// let's check the student number
		int syntax = 70;

		if (syntax >= 70) {
			System.out.println("big class is here");
		} else {
			System.out.println("it must be small course");
		}
		System.out.println("-----------------------------------------------------------------");

		// brother's ages
		int skender = 34;
		int Mehmet = 23;

		if (skender + Mehmet < 55) {
			System.out.println("their ages are smaller then 55");
		} else if (skender + Mehmet == 55) {
			System.out.println("Their ages are equal to 55");
		} else if (skender + Mehmet > 55) {
			System.out.println("Their ages are bigger than 55");
		}
	}

}
