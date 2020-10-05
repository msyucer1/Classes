package com.class103_IfElse_RelationalOps;

public class IfElseIf {

	public static void main(String[] args) {

		// differences between if & else if = if you write "if" sequentally, 
		// eclipse will execute all java codes which has "if" datatype.
		// but if you write "else if", "else if" checks that if there is another code which 
		// has executed before itself and if it find it, 
		// then it wouldn't execute.

		int x = 24;
		int y = 24;

		if (x > y) {
			System.out.println("x is bigger than y");

		} else if (x == y) {
			System.out.println("x equals to y");

		} else {
			System.out.println("I don't know what the x is ");
		}
		System.out.println("-----------------------------------------------------------------");
		int x1 = 23;
		int y1 = 24;

		if (x1 > y1) {
			System.out.println("x1 is bigger than y1");

		} else if (x1 == y1) {
			System.out.println("x1 equals to y1");

		} else {
			System.out.println("I don't know what the x1 is ");
		}
		System.out.println("-----------------------------------------------------------------");

		int x2 = 25;
		int y2 = 24;

		if (x2 > y2) {
			System.out.println("x2 is bigger than y2");

		} else if (x2 == y2) {
			System.out.println("x2 equals to y2");

		} else {
			System.out.println("I don't know what the x2 is ");
		}

		System.out.println("-----------------------------------------------------------------");

		/*
		 * TASK: Create a java program and declare int variable that will hold a day
		 * Based on value of the variable your program should print the name of the day
		 */

		int day = 20;
		int day1 = day % 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I don't know what the day is this");
		}
		if (day1 == 1) {
			System.out.println("Monday");
		} else if (day1 == 2) {
			System.out.println("Tuesday");
		} else if (day1 == 3) {
			System.out.println("Wednesday");
		} else if (day1 == 4) {
			System.out.println("Thursday");
		} else if (day1 == 5) {
			System.out.println("Friday");
		} else if (day1 == 6) {
			System.out.println("Saturday");
		} else if (day1 == 7) {
			System.out.println("Sunday");
		}
		System.out.println("-----------------------------------------------------------------");
		// Write a java program to check whether number is even or odd (Interview
		// Question)

		int k = 7;
		if (k % 2 == 0) {
			System.out.println("this number is even");
		} else {
			System.out.println("this number is odd");
		}

	}

}
