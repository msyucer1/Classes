package com.class112_Manupilations;

import java.util.Scanner;

public class StringManuplations {

	public static void main(String[] args) {
	/*
	 * .length() 			--->> this method calculates that how many character in the word you assign.
	 * .toUpperCase() 		--->> converts each character to upper case
	 * .toLowerCase() 		--->> converts each character to lower case
	 * .equals()			--->> checks if the strings equal. it is case sensitive function.
	 * .equalsIgnoreCase() 	--->> checks if the strings equal. it is not case sensitive function.
	 * .contains()			--->> checks if the word includes what we want. It is case sensitive function.
	 * .startsWith() / .endsWith() --->> will return true/false if value starts/ends with specific value.
	 * .isEmpty() 			--->> checks if the length of word ==0 or not. if it is 0 will return true. else false.
	 * .concat()			--->> it concatenates 2 words.
	 * .trim()				--->> it cuts or trims spaces located at the end and at the beginning.
	 * 
	 */
		
		// 1st way to create a String
		String A = "Hello";
		String B = "1234";
		String C = "!*?-^.*";

		// 2nd way to create a String using new keyword
		String A1 = new String("Helloo");
		System.out.println("-----------------------LENGTH");
		
		String A2 = "Afghanistan";
		System.out.println(A2.length());

		String A3 = "Syntax Technologies";
		System.out.println(A3.length());

		String A4 = "Welcome! Students!!";
		System.out.println(A4.length());
		System.out.println("-----------------------UPPER AND LOWER CASE");

		String A5 = "Hello Mehmet";
		System.out.println(A5.toUpperCase());
		System.out.println(A5.toLowerCase());
		System.out.println("-----------------------EQUALITY (case sensitive)");

		String A6 = "Mehmet";
		String A7 = "MEHMET";
		boolean Check = A6.equals(A7);
		System.out.println(Check);
		A7 = "Mehmet";
		boolean Check1 = A6.equals(A7);
		System.out.println(Check1);
		System.out.println("-----------------------EQUALITY (not case sensitive)");

		String A8 = "Chrome";
		String A9 = "CHROME";
		boolean Check2 = A8.equalsIgnoreCase(A9);
		System.out.println(Check2);
		System.out.println("-----------------------CONTAINS");
		
		String A10 = "Good morning! Mehmet!";
		boolean check3 = A10.contains("Mehmet");
		System.out.println(check3);
		String A11 = "Welcome, Brother";
		boolean check4 = A11.contains("brother");
		System.out.println(check4);
		
		String A12 = "Heloooo haloo";
		String A13 = "haloo";
		boolean check5 = A12.contains(A13);
		System.out.println(check5);
		boolean check6 = A12.toUpperCase().contains(A13);
		System.out.println(check6);
		System.out.println("-----------------------PREFIX SUFFIX");
		
		String A14 = "Mehmet";
		boolean check7 = A14.startsWith("M");
		System.out.println(check7);
		boolean check8 = A14.endsWith("t");
		System.out.println(check8);
		System.out.println("-----------------------EMPTY");
		
		String A15 = "Welcome";
		boolean check9 = A15.isEmpty();
		System.out.println(check9);
		String A16 = "";
		boolean check10 = A16.isEmpty();
		System.out.println(check10);
		System.out.println("-----------------------CONCATENATE");
		
		String A17 = "Selamin ";
		String A18 = "Aleykum";
		System.out.println(A17.concat(A18));
		System.out.println("-----------------------TRIM (cut)");
		
		String A19 = "You may qualify for a multi-policy discount!"; //Expected
		String A20 = "     You may qualify for a multi-policy discount!          "; //Actual
		A20 = A20.trim();
		System.out.println(A19.equals(A20));
		System.out.println("-----------------------TASK");
		
		/* TASK
		 	+ Accept username, password and confirm password and check following requirements:
			+ Username and Password cannot be  empty, if so message=”Username and Password cannot be empty”.
			+ Password should be minimum 8 characters, if less message=”Password is too short”.
			+ Password cannot contain username if so, message=”Password cannot contain username”.
			+ Password should match confirmed password, if not  message “Passwords do not match”.
			Only after all requirements met message “Your username and password has been created” 
		 */
//		String user, pass, check;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Please enter username and password: ");
//		user = scan.nextLine();
//		pass = scan.nextLine();
//		System.out.println("Please confirm your password: ");
//		check = scan.nextLine();
//		
//		if (user.isEmpty() || pass.isEmpty()) {
//			System.out.println("Username or Password cannot be empty");
//		}else {
//			if(pass.length() < 8 ) {
//				System.out.println("Password is too short");
//			}else {
//				if (pass.contains(user)) {
//					System.out.println("Password cannot contain username");
//				}else {
//					if (!pass.equals(check)) {
//						System.out.println("Passwords do not match");
//					}else {
//						System.out.println("Your username and password has been created");
//					}
//				}
//			}
//		}
		System.out.println("----------------------------------------------------------------------");
		
		Scanner scan1;
		String userName, password, confirmedPassword, message;
		
		scan1=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan1.nextLine();
		
		System.out.println("Please enter password");
		password=scan1.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan1.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
		
	}

}
