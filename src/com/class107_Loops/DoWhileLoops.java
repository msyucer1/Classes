package com.class107_Loops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		// do-while ==>> executes first and checks conditions
		// condition in while all the time must be true. loop executes between do and while.
		// if the condition is false in while, program passes to next line after while. And loop stops.
		
		int X = 10;
		do {
			System.out.println("Hello " +X);
			X++;
		} while (X < 15);

		System.out.println("---------------------------------");
	
		//while ==>> checks conditions first and then executes.
		
		int y = 10;

		while (y < 15) {
			System.out.println("Bye");
			y++;
		}

		System.out.println("---------------------------------");

		// prompt user to ask the name 3 times and print "You are doing great ____"
		Scanner scan = new Scanner(System.in);
		String name = null;
		int x = 1;
		
		while (x <= 3) {
			System.out.print("Please enter your name: ");
			name = scan.nextLine();
			x++;
		}
		System.out.println("Your are doing great " + name);
		
		System.out.println("---------------------------------");
		
		/*Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a write amount print "Please enjoy your soda"*/
		
		boolean soda = true;
		double soda1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter price for soda: ");
		
		while (soda == true) {
			soda1 = scan1.nextDouble();
				if (soda1 == 1.99) {
					System.out.println("Enjoy your soda:");
					soda = false;
				} else {
					System.out.println("Please enter price for soda");
			
			}
		}
		System.out.println("---------------------------------");
		double price = 0;
		Scanner sscan=new Scanner (System.in);
		do {
			System.out.println("PLEASE enter price for soda: ");
			price = sscan.nextDouble();
		}while (price !=1.99);
			System.out.println("Please enjoy with your soda");
	}
}
