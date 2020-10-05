package com.Class117_Methods;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		
		char ch[]={'s','t','r','i','n','g','s'};
		String s2=new String(ch);//converting char array to string
		System.out.println(s2);
		
		MethodWithReturnValue obj = new MethodWithReturnValue();
		String str = "Hello Brother";
		
		System.out.println("Today is "+obj.whatIsDay());
		
		char character = obj.CharAt();
		System.out.println(character);
		
		System.out.println(obj.indexOF());
		
		System.out.println(obj.largest(11, 21));
	
		boolean Empty = obj.isempty();
		System.out.println(Empty);
		
	}
	
	String whatIsDay () {
		return "Thursday";
	}
	
	char CharAt () {
		String str = "Hello Brother";
		return str.charAt(3);
	}
	
	int indexOF() {
		String str = "Hello Brother";
		return str.indexOf("B");
	}

	double largest (double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}

	boolean isempty () {
		String str = "Hello Brother";
		return str.isEmpty();
	}

	
	
	
}
