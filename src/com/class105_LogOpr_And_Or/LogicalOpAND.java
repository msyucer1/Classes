package com.class105_LogOpr_And_Or;

import java.util.Scanner;

public class LogicalOpAND {

	public static void main(String[] args) {

		/*
		 * && ((AMPERSAND)) -> and, two options has to be true.
		 * -- True && True = TRUE,
		 * -- True && False = FALSE, 
		 * -- False && True = FALSE, 
		 * -- False && False = FALSE
		 */

		// TASK 1!
		// if number is between 1-10 >> number is small;
		// if number is between 11-100 >> number is medium;
		// if number is between 101-1000 >> number is large

		int num = 3;
		System.out.println("WE ARE LEARNING && (AND) OPERATOR");
		if (num >= 1 && num <= 10) {
			System.out.println("Number is small");
		} else if (num > 10 && num <= 100) {
			System.out.println("Number is medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("Number is large");
		} else {
		}
		System.out.println("-----------------------------------------------------------------EX 1");

		// TASK 2 !!
		// Ask user to nter age and based on the age we will print:
		// if age is older than 1 but less than 3 >> baby
		// if age is older than 3 but less than 5 >> toddler
		// if age is older than 5 but less than 13 >> kid
		// if age is older than 13 but less than 20 >> teenager
		// if age is older than 20 but less than 64 >> adult
		// if age is older than or equal to 64 >> senior

		int age;
		Scanner myAge;
		myAge = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		age = myAge.nextInt();
		if (age >= 1 && age < 3) {
			System.out.println("You are a baby.");
		} else if (age >= 3 && age < 5) {
			System.out.println("You are a toddler.");
		} else if (age >= 5 && age < 13) {
			System.out.println("You are a kid.");
		} else if (age >= 13 && age < 20) {
			System.out.println("You are a teenager.");
		} else if (age >= 20 && age < 64) {
			System.out.println("You are a adult.");
		} else if (age >= 60) {
			System.out.println("You are a senior.");
		}
		System.out.println("-----------------------------------------------------------------EX 2");

		/*
		 * TASK 3 !!! Write a program that will read three inputs of scores (quiz, mid
		 * term, and final scores) and determine the grade based on the following rules:
		 * if the average score >=90 => grade=A if the average score >= 70 and <90 =>
		 * grade=B if the average score>=50 and <70 => grade=C if the average score<50
		 * => grade=F
		 */
		double quiz, mid, fin;
		Scanner Exam = new Scanner(System.in);
		System.out.println("Please enter your quiz score: ");
		quiz = Exam.nextDouble();
		System.out.println("Please enter your mid term score: ");
		mid = Exam.nextDouble();
		System.out.println("Please enter your final score: ");
		fin = Exam.nextDouble();
		double aver = (fin + mid + quiz) / 3;

		if (aver > 90 || aver == 90) {
			System.out.println("Your grade is A");
		} else if (aver >= 70 && aver < 90) {
			System.out.println("Your grade is B");
		} else if (aver >= 50 && aver < 70) {
			System.out.println("Your grade is C");
		} else if (aver < 50) {
			System.out.println("Your grade is F");
		} else {
		}
		System.out.println("-----------------------------------------------------------------EX 3");

		// TASK 4 !!
		/*
		 * Ask user to enter price and boolean value for sale Based on the sale we will
		 * check the price: if price < 20 --> apply disount 20% and give final price if
		 * prce is >20 les than 100 --> apply discount 30% and give final price. if
		 * price is >100 less than 500 --> apply discount 50% and give final price.
		 */

		Scanner A;
		boolean Sale;
		int price;

		A = new Scanner(System.in);
		System.out.println("Please enter if there is a sale: ");
		Sale = A.nextBoolean();

		if (Sale) {
			System.out.println("Let's check discounts. Please enter price of your sale: ");

			price = A.nextInt();
			double A1 = price - (price * 0.20);
			double B1 = price - (price * 0.30);
			double C1 = price - (price * 0.50);

			if (price < 20) {
				System.out.println("You ca apply 20% discount. Your final price will be " + A1 + "$");
			} else if (price >= 20 && price < 100) {
				System.out.println("You can apply 30% discount. Your final price will be " + B1 + "$");
			} else if (price >= 100 && price < 500) {
				System.out.println("You can apply 50% discount. Your final price will be " + C1 + "$");
			} else {

			}
		} else {
			System.out.println("Not interested.");
		}

	}

}
