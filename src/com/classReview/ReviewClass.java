package com.classReview;

import java.util.Scanner;

public class ReviewClass {

	public static void main(String[] args) {

		// Write a program to find out what to do for the following temperatures
		// Temperatures is greater than 100 print out Stay inside it's too hot
		// temperatures is greater than 50 and less than 99 print out Wear summer clothes
		// temperatures is greater than 30 and less than 49 print out Wear winter clothes
		// temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
		// lastly if the temperature is lower than that print out Call for help it's too cold outside

		Scanner scan = new Scanner(System.in);
		int temp;
		System.out.println("Please enter outside temperature: ");
		temp = scan.nextInt();

		if (temp >= 100) {
			System.out.println("Stay inside. It's too hot.");
		} else if (temp >= 50 && temp <= 99) {
			System.out.println("Wear summer clothes.");
		} else if (temp >= 30 && temp <= 49) {
			System.out.println("Wear winter clothes.");
		} else if (temp >= 10 && temp <= 29) {
			System.out.println("Stay inside it's too cold.");
		} else if (temp < 10) {
			System.out.println("Call for help it's too cold outside.");
		}

		System.out.println("-----------------------------------------------------------------EX 1");

		// Write a program that allows a user to input age to find out if the user is
			// either Too Young, Young Person, Middle Age Person, or too Old
		// Age should NOT be greater than 18 print out Too Young
		// Age should be between 18 and 35 inclusive print out Young Person
		// Age should equal 36 or less than or equal to 60 inclusive print out You are
			// Middle Age Person If the age is greater than 60 print print out You are too Old
		// Create an int variable named age
		// Must use a Scanner
		
		int age;
		String person;
		System.out.println("Please enter your age:");
		age = scan.nextInt();
		if (age < 18) {
			person = "Too young";
		}else if (age >= 18 && age <= 35) {
			person = "Young";
		}else if (age >= 36 && age <= 60) {
			person = "Middle Age";
		}else if (age >= 60) {
			person = "too Old";
		}else {
			person = "You are not a human";
		}
		
		System.out.println("You are "+person+" person.");
		System.out.println("-----------------------------------------------------------------EX 2");

		int day;
		String day1;
		System.out.print("Please enter the day number: ");
		day = scan.nextInt();
		
		switch (day) {
		case 1:
			day1 ="Monday";
			break;
		case 2:
			day1 ="Tuesday";
			break;
		case 3:
			day1 ="Wednesday";
			break;
		case 4:
			day1 ="Thursday";
			break;
		case 5:
			day1 ="Friday";
			break;
		case 6:
			day1 ="Saturday";
			break;
		case 7:
			day1 ="Sunday";
			break;
		default:
			day1 ="Are u kidding !?";
			break;
		}
		
		System.out.println(day1);
		
		System.out.println("-----------------------------------------------------------------EX 3");
		
		// Write a program to found out the user level of experience
		// Must use a switch statement with a String variable named levelString and a int variable named level
		// Beginner level should be 1
		// Intermediate level should be 2
		// Expert level should be 3
		
		int level;
		String levelString;
		System.out.println("Please enter your level: ");
		level = scan.nextInt();
		
		switch (level) {
		case 1:
			levelString = "Beginner";
			break;
		case 2:
			levelString = "Intermediate";
			break;
		case 3:
			levelString = "Expert";
			break;
		default:
			levelString = "I don't know bro! What the hell is your level man?";
			break;
		}
		System.out.println("LEVEL = "+levelString);
	}

}


	