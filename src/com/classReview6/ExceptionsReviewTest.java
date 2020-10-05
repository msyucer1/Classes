package com.classReview6;

public class ExceptionsReviewTest {

	public static void main(String[] args) {

		ExceptionsReview obj = new ExceptionsReview();
		try {
			// ArithmeticException
			obj.arithmetic(4, 0);

		} catch (ArithmeticException e) {
			System.out.println("I just caught an ArithmeticException");
			System.out.println(e.getMessage());
		}
		try {
			// ArrayIndexOutOfBoundsException
			obj.arrayIndexOutOfBounds();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I just caught an ArrayIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}

		try {
			// StringIndexOutOfBoundsException
			obj.stringIndexOutOfBounds();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("I just caught an StringIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}

		try {
			// NullPointerException
			obj.nullPointer();
		} catch (NullPointerException e) {
			System.out.println("I just caught an NullPointerException");
			System.out.println(e.getMessage());
		}

		try {
			// NegativeArraySizeException
			obj.negativeArraySizeException();
		} catch (NegativeArraySizeException e) {
			System.out.println("I just caught an NegativeArraySizeException");
			System.out.println(e.getMessage());
		}

		try {
			// Exception
			obj.throwsMethod();
		} catch (NegativeArraySizeException e) {
			System.out.println("I just caught an NegativeArraySizeException");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("I just caught an Exception");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Hey, I just caught Every type of Exception");
		}
	}
}
