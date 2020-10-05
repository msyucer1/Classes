package com.class113_String_SplitReverseReplace;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {

//		Create a String and print it in reverse order (Sunday : yadnuS).

		String day = "Sunday";
		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();
//		Create a String and if the String is not empty perform the following: 
//		if the String has an odd number of characters and has 3 or more characters, 
//		print the character in the middle of the String

		String name = "MehmetYUCER";
		if (name.length() % 2 != 0 && name.length() > 3) {
			System.out.println(name.charAt(name.length() / 2));
		}

//		Write a program that reads two people’s first names and if they expecting boy or girl? 
//		Based on the input suggests a name for a baby:
//		Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? boy
//			Suggested baby name: DANRY
//
//			Example Output:
//			Mom’s first name? Mary
//			Dad’s first name? Daniel
//			Boy or Girl? girl
//			Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter father's name: ");
		String namef = scan.nextLine();
		System.out.print("Please enter Mother's name: ");
		String namem = scan.nextLine();
		System.out.print("Please enter child's gender: ");
		String gender = scan.nextLine();

//		String DadsName = "Mehmet";
//		String MomsName =  "Feyza";
//		String sex = "Girl";
		if (gender.equalsIgnoreCase("Female")) {

			System.out.println((namem.substring(0, (namem.length() / 2))).concat(namef.substring(3, namem.length())));

//		String DadsName1 = "Mehmet";
//		String MomsName1 =  "Feyza";
//		String sex1 = "Boy";
		} else {
			System.out.println((namef.substring(0, (namef.length() / 2))).concat(namem.substring(3, namem.length())));
		}

		System.out.println("-----------------------2ND WAY-------------");

		Scanner scan1;
		String motherName, fatherName, gender1, babyName;

		scan1 = new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName = scan1.nextLine();

		System.out.println("Please enter fathers name");
		fatherName = scan1.nextLine();

		System.out.println("Please enter expected gender");
		gender1 = scan1.nextLine();

		if (gender1.equalsIgnoreCase("boy")) {
			babyName = fatherName.substring(0, fatherName.length() / 2) + motherName.substring(motherName.length() / 2);
		} else if (gender1.equalsIgnoreCase("girl")) {
			babyName = motherName.substring(0, motherName.length() / 2) + fatherName.substring(fatherName.length() / 2);
		} else {
			babyName = "No suggestion";

		}
		System.out.println(babyName.toUpperCase());
	}
}
