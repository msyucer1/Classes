package com.class108_break_Continue_Exerc;

import java.util.Scanner;

public class ForLoopExercises {

	public static void main(String[] args) {

		/*
		 * prompt user to enter 2 integer and compare At the end print largest.
		 */

		Scanner scan = new Scanner(System.in);
		int num1, num2, larg = 0;
		for (int X = 1; X <= 2; X++) {
			System.out.println("Please enter first number: ");
			num1 = scan.nextInt();

			System.out.println("Please enter second number: ");
			num2 = scan.nextInt();

			if (num1 > num2) {
				larg = num1;
			} else if (num2 > num1) {
				larg = num2;
			} else {
				System.out.println("Numbers are equal");
			}
			System.out.println("The largest number is " + larg);
		}
		
		System.out.println("--------------------------------------------");
		
		int FirstN, SecondN;
		System.out.println("Please define number range:");
		FirstN = scan.nextInt();
		SecondN = scan.nextInt();
		
		if (FirstN<SecondN) {
		for (int i =FirstN; i<=SecondN; i++) {
			System.out.print(i+" ");
		}
		}else {
			System.out.println("I won't run your code");
		}
		System.out.println("\n--------------------------------------------EX2");
		
	
		
	}
}
