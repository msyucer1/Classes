package com.class135_Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		
//		try {
//			System.out.println("try block code");
//			System.out.println(a/b);
//		} catch (ArithmeticException e){
//			System.out.println("catch block code");
//		} finally {
//			System.out.println("finally block code");
//		}
		
		try {
			System.out.println(a/b);
		} finally {
			System.out.println("finally block code");
		}
		
		
		
	}
}
