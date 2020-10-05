package com.class102_Arithmetic_concat_Declaration;

public class ArithmeticOperations {

	public static void main(String[] args) {

		//declare 2 int variables and then we perform;
		//addition, subtraction, multiplication, division
		
		int a = 30;
		int b = 6;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		int sum = a+b;
		int sub = a-b;
		int mult = a/b;
		int div = a*b;
		
		System.out.println("\nThe sum of 2 number is " +sum);
		System.out.println("And the subtraction of 2 number is "+sub);		
		System.out.println("The multiplicaton of 2 number "+mult);		
		System.out.println("The division of 2 number is "+div );
		
		int t = 5;
		t += 4; // add 4 to t and update t's value
		t *= 4; // multiply t with 4 and update t with result
		t -=31; // subtract 31 from t and update t's value
		t /=5; //divide t to 5 and update t's value
		t--; //subtract 1 from t
		t++; // add 1 to t
		System.out.println(t);
	}

}
