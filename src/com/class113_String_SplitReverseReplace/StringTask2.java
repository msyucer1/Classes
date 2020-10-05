package com.class113_String_SplitReverseReplace;

public class StringTask2 {

	public static void main(String[] args) {

		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 */
		String arg = " Hey today is saturday ";
		System.out.println(arg.replace(" ", ""));

		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String arg1 = " Hey tod^%$ay is 9879saturday 987";
		System.out.println((arg1.replaceAll("[^A-Za-z]", "").length()));

		/*
		 * You have a String a=“Is it saturday! Is it raining! Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */
		String a = "Is it saturday! Is it raining! Do we have a Java Class today?";
		String[] array = a.split("!");
		System.out.println(array.length);

		
		/* 4.How to find out the part of the string from a string? What is substring?
		 * Find number of words in string?*/
		
		
		/* 5. Write a java program to reverse String. Reverse a string word by word?
		 */

	}

}
