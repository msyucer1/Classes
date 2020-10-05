package com.class135_Exceptions;

public class ChildToParentException {

	public static void main(String[] args) {
		int [] array = {17,99,4};
		
		try {
			Thread.sleep(2000);
			System.out.println(array[3]); //new ArrayOutOfBoundException
		}catch(Exception e) {
			
		}
 	
	System.out.println("Code after an exception");
	
	}
}
