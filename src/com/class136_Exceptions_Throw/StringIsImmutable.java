package com.class136_Exceptions_Throw;

public class StringIsImmutable {

	public static void main(String[] args) {
		
//		2 ways to create String:
//		1st way - using string literal
		String str = "Hello";
		
//		2nd way - using new keyword
		String str2 = new String("Hello2");
		
		str.toUpperCase();
		str.replace("o", "a");
		System.out.println(str);
	
		str = str.toUpperCase();
		str = str.replace("O", "a");
		System.out.println(str);
		
	}
}
