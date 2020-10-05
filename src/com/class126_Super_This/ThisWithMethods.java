package com.class126_Super_This;

public class ThisWithMethods {

	public void m1() {
		System.out.println("I'm m1 method");
	}

	public void m2() {
		this.m1();
		// m1(); if you don't write this keyword it adds by default compiler.
		System.out.println("I'm m2 method");
	}
	
	
	public static void main(String[] args) {
		ThisWithMethods obj = new ThisWithMethods();
		obj.m2();
	}

}
