package com.class135_Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exceptions_Task2 {

	/*
	 * Create a static method that will return a List of Exceptions. Inside your
	 * method create objects of 4 exception classes and store them inside your list.
	 * Call your method inside main and print name and details of all Exception
	 * objects.
	 * 
	 */

	public static List<Exception> getList() {

		List<Exception> list = new ArrayList<>();

//		ArithmeticException
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			list.add(ae);
		}

//		IndexOutOfBoundsException
		int[] array = { 10, 23 };
		try {
			System.out.println(array[4]);
		} catch (IndexOutOfBoundsException ioobe) {
			list.add(ioobe);
		}

//		InputMismatchException
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");

		try {
			int num = scan.nextInt();
		} catch (InputMismatchException ime) {
			list.add(ime);
		}

//		NullPointerException
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException npe) {
			list.add(npe);
		}

		return list;
	}

	public static void main(String[] args) {
		List <Exception> exceptionList = getList();
		System.out.println(exceptionList.size());
		
		for (Exception singleException : exceptionList) {
			System.out.println(singleException);
		}
	}
}
