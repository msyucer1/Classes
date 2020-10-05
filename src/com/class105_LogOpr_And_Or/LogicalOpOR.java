package com.class105_LogOpr_And_Or;

import java.util.Scanner;

public class LogicalOpOR {

	public static void main(String[] args) {

		/*
		 * || ((PIPE LINES)) -> or, one of two option has to be true. 
		 * -- True || True = TRUE, 
		 * -- True || False = TRUE, 
		 * -- False || True = TRUE, 
		 * -- False || False = FALSE.
		 */

		// TASK 1 !!
		// we have 7 days a week
		// if days between 1-5 --> weekday
		// if days between 6-7 --> weekend
		// otherwise "Not a valid day"

		System.out.println("WE ARE LEARNING || (OR) OPERATOR");
		int day = 5;
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			// false OR false OR false OR false OR true == TRUE
			System.out.println("It is a Weekday :( ");

		} else if (day == 6 || day == 7) {
			// false OR false == FALSE
			System.out.println("It is a weekend !");

		} else {
			System.out.println("Not a valid day.");
		}

		System.out.println("-----------------------------------------------------------------EX 1");

		String Computer;
		Scanner Laptop = new Scanner(System.in);
		System.out.print("Please enter your Laptop Brand: ");
		Computer = Laptop.nextLine();
		if (Computer.equalsIgnoreCase("Hp") || Computer.equalsIgnoreCase("Dell")) {
			System.out.println("Your computer is perfect.");
		} else if (Computer.equalsIgnoreCase("Toshiba") || Computer.equalsIgnoreCase("Lenovo")) {
			System.out.println("Your computer is OK.");
		} else if (Computer.equalsIgnoreCase("Apple") || Computer.equalsIgnoreCase("Macbook")) {
			System.out.println("Your computer is bad :P ");
		} else {

		}
		System.out.println("-----------------------------------------------------------------EX 2");

		/*
		 * Task Prompt the user to enter heights in inches. Person should be classified
		 * as one of the following: • short (under 5 feet) • medium(5 to 6 feet) • tall
		 * (6 feet and over)
		 */

		Scanner inc = new Scanner(System.in);
		System.out.println("Please enter your height in inches (for ex: 6.3 || 5.2): ");
		double height = inc.nextDouble();
		if (height < 5.0) {
			System.out.println("You are short");
		} else if (height >= 5.0 || height < 6.0) {
			System.out.println("You have a medium height");
		} else if (height == 6.0 || height > 6.0) {
			System.out.println("Your are a tall man");
		} else {

		}

		System.out.println("-----------------------------------------------------------------EX 3");

	}

}
