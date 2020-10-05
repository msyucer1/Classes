package com.Class115_reviewInterviewQ;

import java.util.Scanner;

public class ReviewClass14Tasks {

	public static void main(String[] args) {
		
//		1. Write a program to swap 2 numbers without a temporary variable? 
//		Swap 2 strings without a temporary variable?
		
		int num1 = 72;
		int num2 = 98;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("New value of num1:"+num1+" and new value of num2:"+num2);
		
		String one = "moving";
		String two = "Class";
		one = one + two;
		two = one.substring(0,one.length()-two.length());
		one = one.substring(two.length());
		System.out.println("New string one: "+one+" and \nnew string two: "+two);
		System.out.println("-------------------------");
		
//		2.Write a java program to find the second largest number in the array? 
//		Maximum and minimum number in the array?
		
		int [] array = {1,2,3,55,66,989,1010,45,78,852,456};
		int max = 29;
		int min = 153;
		int secondLargest = array[0];
		for (int arr : array) {
			if (arr > max) {
				max = arr;
			}
			if (arr < min) {
				min = arr;
			}
		}
		System.out.println("In this array maximum number is:"+max+" and minimum number is:"+min);
		for (int a :  array ) {
			if (a > secondLargest && a < max  ) {
				secondLargest = a;
			}
		}
		System.out.println("In this array the second largest number is:"+secondLargest);
		System.out.println("-------------------------");
		
//		3. Find out how many alpha characters present in a string?
		String Sentence = "Hey Tetiana!?!?! Howare you &^%today7857 You cameto class today 98ea56r()ly ";
		String JustLetter = Sentence.replaceAll("[^A-Za-z]", "");
		System.out.println("New sentence: "+JustLetter);
		System.out.println("This sentence has "+JustLetter.length()+" characters.");
		System.out.println("-------------------------");
		
//		5. Write a java program to reverse String? Reverse a string word by word?
		String sent = "Hello This is our new building. I came here first.";
		String reverse = "";
		for (int i = sent.length()-1; i >=0 ; i--) {
			reverse = reverse+sent.charAt(i);
		}
		System.out.println(reverse);
		System.out.println("-------------------------");
		
//		6. Write a Java Program to find whether a String is palindrome or not?
//		Palindrome = if the word same with the reverse this word or string is palindrome. 
//		(141, 34543, madam, dad)
		
		Scanner scan = new Scanner (System.in);
		System.out.println("PLease enter a string to check if it is palindrome: ");
		String pali = scan.nextLine();
		String rever = "";
		
		for (int i = pali.length()-1; i>=0; i--) {
			rever += pali.charAt(i);
		}
			if (pali.equalsIgnoreCase(rever)) {
				System.out.println("this string is palindrome!!");
			}else {
				System.out.println("Try different strings.");
			}
		
//		7. Write a java program to check whether a given number is prime or not?
//		PrimeNuber should meet 2 conditions: divisible by 1 & byItself ONLY
//		2,3,5,7,11,13,17,19,23,29
		
		System.out.println("Please enter a number to check if it is prime: ");
		int numbre = scan.nextInt();
		boolean check = true;
		for (int i = 2; i<numbre; i++) {
		if (numbre % i != 0) {
			
		}else {
			check = false;
			break;
		}
		}
		System.out.println("Is this number prime: "+check);
		
//		8. Write a Java Program to print first 10 numbers of Fibonacci series.
//		Fibonacci series is this => 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
		
		
		
		
		
		
		
		
		
	}
}
