package com.class118_AccessModifiers;

import java.util.Scanner;

public class NestedLoopHomeworks3 {

	public static void main(String[] args) {
		
		NestedLoopHomeworks3 obj = new NestedLoopHomeworks3();
		obj.GuessNumber ();
		obj.findLeapYear();

	}

	void GuessNumber () {
//		5.Write a guessing game where the user has to guess a secret number between 1 and 29. After every guess input,
//		the program tells the user whether their number was too large or too small. 
//		The program will keep asking the user to enter the number until he finds the correct number. 
//		When the correct answer is found the system should display "Congratulations!!. You got it!".

		Scanner scan = new Scanner (System.in);
		int secret, guess;
		secret = 19;

		System.out.println("Please enter any number to guess between 1 and 29: ");
		do {
			guess = scan.nextInt();
			
			if (guess<secret) {
				System.out.println("Number is too small. Keep trying:");
			}else if(guess>secret) {
				System.out.println("Number is too big. Keep trying");
			}
		}while (secret != guess);
		System.out.println("Congratilations!! You got it !");
	}
	void findLeapYear () {
//		6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year. 
//		As soon as the user enters the correct leap year exit the loop.

		Scanner scan1 = new Scanner (System.in);
		int year=0;
		
		for (int i =0; i<=10;i++) {
			System.out.println("Please enter guessed leap year: ");
			year = scan1.nextInt();
			
			// if year is divisible by 4 and 400, it is a leap year.
			// if year is divisible by 100, it is not a leap year.
			
			if (year%4==0) {
				System.out.println("Yes, this year is leap year.");
				break;
			}else {
				System.out.println("This is not a leap year.");
			}
		}
		
		
	}
	
}
