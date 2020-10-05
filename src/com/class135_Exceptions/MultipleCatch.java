package com.class135_Exceptions;

public class MultipleCatch {

	public static void main(String[] args) {

		System.out.println("Beginning of the code");

		try {
			Thread.sleep(2000);
			System.out.println(10/0);
		} catch (InterruptedException e) {
			System.out.println("Code of interrupted exception  catch");
		
		} catch (ArithmeticException e) {
			System.out.println("Code of Arithmetic exception catch");
			
//			3 ways to print name and details of an exception
//			e.printStackTrace(); name of e, detail of e, location
//			System.out.println(e); name of e and detail of e
//			System.out.println(e.getMessage()); detail of e
			
		}
	}
}
