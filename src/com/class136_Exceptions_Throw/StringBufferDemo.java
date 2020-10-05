package com.class136_Exceptions_Throw;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		str.toUpperCase();
		System.out.println(str);
		
//		nothing changed
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.deleteCharAt(3);
		System.out.println(sb);
//		it deleted
		
	}
	
}
