package com.class135_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_Task1 {

	public static void main(String[] args) {

		// TASK1
		// How would handle InputMismatchException?
		// Input Mismatch Exception when user enters mismatch value then programmer
		// expected.

		Scanner scan = new Scanner(System.in);

		try {
			int num = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Code in the catch block\n");
//			e.printStackTrace();
			System.out.println(e);
		}

	}
}
