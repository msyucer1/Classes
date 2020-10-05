package com.class118_AccessModifiers;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {

		NestedLoop obj = new NestedLoop();
		obj.EvenOdd();
	}

	void EvenOdd() {

		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and the from that range print the sum of the even and odd
		 * integers
		 */
		
		int range1, range2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter range of numbers(2 numbers):");
		range1 = scan.nextInt();
		range2 = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = range1; i < range2; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}

		System.out.println(
				"Sum of even numbers in your range is " + sumEven + " and sum of odd numbers in your range " + sumOdd);
	}

}
