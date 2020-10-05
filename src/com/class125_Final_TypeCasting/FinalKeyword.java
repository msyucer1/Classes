package com.class125_Final_TypeCasting;

public class FinalKeyword {
	
	/**
	 * (non access modifiers) Final keyword can be used in 3 places/ways 
	 * 1. variables 	-- WE CAN NOT CHANGE VALUES
	 * 2. methods 		-- WE CAN NOT OVERRIDE FINAL METHODS
	 * 3. classes		-- IF YOUR CLASS IS FINAL YOU CAN NOT HAVE A CHILD
	 */
	
	public static void main(String[] args) {
		System.out.println(name);
		//name = "Haydar"; 
	}
	
	final String str = "Hello";
	// str = "John";
	// final means constant -->> you can not change it.

	public static final String name = "Syntax";

	
	public final void method1 () {
		System.out.println("Hello from parent class");
	}
}

//	Can not override final methods
//	class ChildOfFinalKeyword extends FinalKeyword {
//		public void method1 () {
//			System.out.println("Hello from child class");
//		}
//	}
