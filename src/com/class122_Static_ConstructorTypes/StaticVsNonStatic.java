package com.class122_Static_ConstructorTypes;

public class StaticVsNonStatic {

	public String name = "John";
	
	public static String lastName = "Snow";
	
	// if our method static we cannot access to instance variables or methods.
	// if our method is instance we can access to statics and instance both. 
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();		
		obj.getInfo();
		getInfo1();  //within same class we can call it by using method / variable name;
		System.out.println(lastName);
		System.out.println(obj.name);
	}
	
	// non static method - can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
	}
	
	// Static method can access only to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName);
		//will get an error
		System.out.println("I am a static method");
	}
	
}
