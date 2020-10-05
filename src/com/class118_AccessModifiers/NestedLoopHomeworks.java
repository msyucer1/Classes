package com.class118_AccessModifiers;

import java.util.Scanner;

public class NestedLoopHomeworks {

	public static void main(String[] args) {
		
		NestedLoopHomeworks obj =  new NestedLoopHomeworks();
		obj.sumNumbers();
		obj.payItems();
		obj.payItemsDoWhile();
		
	}
	void sumNumbers () {
//		1. Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.
	
	Scanner scan = new Scanner(System.in);
	int sumOdd=0, sumEven=0, num1, num2;
	System.out.println("Please enter two numbers to satisfy range: ");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	
	if (num2 > num1) {
	for (int i = num1; i<num2; i++) {
		if (i%2==0) {
			sumEven += i;
		}else {
			sumOdd += i;
		}
	}	
	}
	System.out.println("Sum of even numbers in your range is "+sumEven+" and sum of odd numbers in your range is "+sumOdd);
	System.out.println("----------------------------------------------------");
	
	}
	void payItems () {
//		
//		2. Ask user to enter the item they want to buy and the price for the item. 
//			Then ask user to pay for it. Every time user enters money accumulate the amount and 
//			tell user how much is left to pay off the amount. 
//			Whenever user done with payments tell them "Thank you for shopping!"
		
		Scanner scan1 = new Scanner (System.in);
		String item;
		int price = 100;
		int payment=0, total1=0;
		System.out.println("Please enter that what you want to buy: ");
		item = scan1.nextLine();
		System.out.println("Please pay for the item: ");
		payment = scan1.nextInt();
		
		while (true) {
			if (payment > price) {
				payment -= price;
				System.out.println("don't forget your $"+payment+ " change!! Thank you for shopping!!");
				break;
			}while (payment != total1) {
				total1 += payment;
				System.out.println("Please pay for it. You need to pay "+(price - total1)+" more");
				if (price == total1) {
					break;
				}
				payment = scan1.nextInt();
			}
				System.out.println("Thank you for shopping!!");
				
		System.out.println("----------------------------------------------------");
		}
	}
	void payItemsDoWhile () {
		Scanner scan2 = new Scanner (System.in);
		String item1;
		double balance, total=0, price1, payment1, change1;
		System.out.println("Please enter that what you want to buy: ");
		item1 = scan2.nextLine();
		System.out.println("Please enter the item's price: ");
		price1 = scan2.nextDouble();
		
		do {
			System.out.println("Please pay for item: ");
			payment1 = scan2.nextDouble();
			
			total += payment1;
			
			if (payment1 > price1) {
				change1 = total - payment1;
				System.out.println("Please don't forget your $"+change1+" change! Thank you for shopping");
				break;
			}else if (payment1 <price1) {
				balance = price1 - total;
				System.out.println("You need to pay $"+balance+ " more");
			}
		
		}while (price1 != payment1);
		System.out.println("Thank you for shopping");
		
	}

	}


