package com.classReview6;

public class ExceptionsReview {
	/**
	 *
	 * Create a new class called ExceptionsReview, in it have the following methods
	 *
	 * void arithmetic(int a, int b) method to divide two integers for
	 * ArithmeticException Arithmetic error, such as divide-by-zero.
	 *
	 * void nullPointer() method to be able to throw NullPointerException Invalid
	 * use of a null reference.
	 *
	 * void arrayIndexOutOfBounds() method to be able to throw
	 * ArrayIndexOutOfBoundsException Array index is out-of-bounds.
	 *
	 * void stringIndexOutOfBounds() method to be able to throw
	 * StringIndexOutOfBoundsException an index is either negative or greater than
	 * the size of the string.
	 *
	 * void negativeArraySizeException() method to be able to throw
	 * NegativeArraySizeException Array created with a negative size.
	 *
	 *
	 * Create another class called Test and create an object of the ExceptionsReview
	 * class and
	 *
	 * 1. call all the methods you created 2. handle all the exceptions using try
	 * catch finally blocks 3.
	 */

	void arithmetic(int a, int b) {
		System.out.println("ArithmeticException");
		int c = a / b;

	}

	void nullPointer() {
		System.out.println("NullPointerException");

		ExceptionsReview exrv = new ExceptionsReview();
		exrv = null;
		exrv.arithmetic(2, 1);

	}

	void stringIndexOutOfBounds() {
		System.out.println("StringIndexOutOfBoundsException");
		String str = "Hi students!";
		char chr = str.charAt(17);

	}

	void arrayIndexOutOfBounds() {
		System.out.println("ArrayIndexOutOfBoundsException");

		int[] arr = new int[5];
		arr[6] = 3;
	}

	void negativeArraySizeException() {
		System.out.println("NegativeArraySizeException");
		int[] arr = new int[-5];
//       throw new NegativeArraySizeException(“Hey this is my NegativeArraySizeException”);
	}

	Throwable throwsMethod() throws Exception {
		System.out.println("Exception");
		throw new Exception();
	}

}
