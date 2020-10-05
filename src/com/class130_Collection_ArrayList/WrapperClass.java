package com.class130_Collection_ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer1 = new Integer(10); //Boxing	it converted your primitive data to object
		System.out.println(integer1);
		
		Integer integer2 = 10; //AUTOBOXING
		int num2 =integer2; //AUTO UNBOXING
		
		System.out.println(integer1.intValue()); //Unboxing	it gives you, your primitive data
		
	}
}
