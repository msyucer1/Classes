package com.class118_AccessModifiers;

public class NestedLoopHomeworks2 {

	public static void main(String[] args) {
		
	NestedLoopHomeworks2 obj = new NestedLoopHomeworks2();
	obj.printPattern();
	obj.printPattern2();
		
	}
	
	void printPattern () {
//		3. Print the following pattern:
//		1
//		12
//		123
//		1234
//		12345
	
	for (int i = 1; i<=5; i++) {
		for (int x = 1; x<=i; x++) {
			System.out.print(x);
		}
		System.out.println();
	}
	System.out.println("----------------------------------------------------");
	}
	void printPattern2 () {


//		4. Print the following pattern:
//			*
//			**
//			***
//			****
//			*****
//			****
//			***
//			**
//			*
	
	for (int i = 1; i<=5 ; i++) {
		for (int y = 1; y<=i; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int t = 1; t<=4 ; t++) {
		for (int y = 4; y>=t; y--) {
			System.out.print("*");
		}
	System.out.println();
	}
	System.out.println("----------------------------------------------------");
	

	}


}
