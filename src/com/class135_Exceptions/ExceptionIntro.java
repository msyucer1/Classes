package com.class135_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionIntro {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		System.out.println(a / b);

//				System.out.println("Code after an exception");

//				checked exception
//				Thread.sleep(2000);

//				ArithmeticException exception=new ArithmeticException();
//				throw exception;

		List<Object> fixedData = new ArrayList<>();
		while (true) {
			Object data = new byte[64 * 1024 - 1];
			fixedData.add(data);
		}
		// System.out.println("Code after an error");will get an c error- unreachable
		// code

//		After exception your codes are terminated bec of this line 13 couldn't execute
//		System.out.println("Code after an exception");
	}
}