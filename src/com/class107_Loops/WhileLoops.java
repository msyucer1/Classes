package com.class107_Loops;

public class WhileLoops {

	public static void main(String[] args) {

		int A = 2;
		while (A <= 20) {
			System.out.println("Good morning " + A);
			A += 2;
		}
		System.out.println("----------------------------------------------EX1");
		int X = 20;
		while (X >= -4) {
			System.out.println("Value of X= " + X);
			X -= 3;
		}
		System.out.println("----------------------------------------------EX2");

		int y = 31;
		while (y >= 3) {
			System.out.println("Y'den kalan: " + y);
			y /= 3;
		}
		System.out.println("----------------------------------------------EX3");
		int K = 1;
		while (K <= 20) {
			System.out.print(K + " ");
			K++;
		}
		System.out.println("\n----------------------------------------------EX4");

		int A1 = 10;
		while (A1 >= 1) {
			System.out.print(" " + A1);
			A1--;
		}
		System.out.println("\n----------------------------------------------EX5");

		/*
		 * TASK Print only odd numbers between 1 to 20 inclusive
		 */
		System.out.println("Odd numbers between 1 to 20:");
		int B1 = 1;
		while (B1 <= 20) {

			System.out.print("  " + B1);
			B1 += 2;
		}
		System.out.println("\n----------------------------------------------EX6");

		/*
		 * TASK Print only odd numbers between 1 to 20 inclusive
		 */

		int C = 1;
		while (C <= 20) {
			if (C % 2 != 0) {
				System.out.print(" I'm inside while loop: ");
				System.out.println(C);
			} else {
			}
			C++;
		}
		System.out.println("\n----------------------------------------------EX7");
		
		// TASK print only even numbers between 10 to 100
		int D = 10;
		while (D<=100) {
			System.out.print(" "+D);
			if (D==50) {
				System.out.println("\n");
			}
			D+=2;
		}
		System.out.println("\n----------------------------------------------EX8");
		
		/*
		 * TASK: Create a boolean variable workDay and assign true
		 * create int variable day and assign it to 1.
		 * as long as it is a workDay print i need a day off and increase
		 * once day is 6 then print don't need a day off any more
		 */

		boolean workDay = true;
		int Day = 1;
		
		while (workDay) {
			
			if (Day == 6) {
				System.out.println("I don't need a day off any more");
				workDay=false;
			} else {
			System.out.println("I need a day off "); }
			Day++;
		}
		System.out.println("\n----------------------------------------------EX8");
		
		double b = 20;
		while (b>=1 && b<5) {
			System.out.println("bölüm = "+b);
			b /= 6;
		}
	}
}
