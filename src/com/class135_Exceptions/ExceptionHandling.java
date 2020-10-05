package com.class135_Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		try {
			Thread.sleep(2000);//object of an exception might be thrown (new InterruptedException)
		}catch (InterruptedException e) {
			System.out.println("I am a catch block code");
			e.getMessage();
		}
		
		System.out.println("The end of the program");
		
		//InterruptedException e =new InterruptedException();
		//Exception e  =  new InterruptedException()
	}
}
