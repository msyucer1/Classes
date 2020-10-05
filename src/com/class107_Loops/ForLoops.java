package com.class107_Loops;

public class ForLoops {

	public static void main(String[] args) {

// repl. it 8.5 homework.
//	    int A = 1;
//	    while (A <= 10){
//	      if (A >=7 && A<=9 || A==6){
//	        
//	      }else{
//	      System.out.println(A);
//	        
//	      }
//	      A++;
//	    }

		int x = 1;
		for (; x < 11; x++) {
			System.out.println("X = " + x);
			if (x == 5) {
				System.out.println("You are on the half way");
			}
		}
		System.out.println("---------------------------------EX1");
		
		//initialize	condition   increment/Decrement
	for (int a = 3; 	a < 10; 	a++	) {
			
			System.out.println("Hello BRO");
		}
		System.out.println("---------------------------------EX2");

		/* I want to print numbers from 10 to 1 */
		for (int A = 10; A >= 1; 
) {
			System.out.print(" " + A);
		}
		System.out.println("\n---------------------------------EX3\n");

		// print numbers from 1 to 100

		for (; x <= 100; x++) {
			System.out.print(" " + x);
		}
		System.out.println("\n---------------------------------EX4\n");
		// print numbers from 100 to 1
		for (int C = 100; C >= 1; C--) {
			System.out.print(" " + C);
		}
		System.out.println("\n---------------------------------EX5");
		// print odd numbers from 1 to 20
		for (int V = 1; V <= 20; V += 2) {
			System.out.print(" " + V);
		}
		System.out.println("\n---------------------------------EX6");
		// print even numbers from 20 to 1
		for (int B = 20; B >= 1; B -= 2) {
			System.out.print(" " + B);
		}
		System.out.println("\n---------------------------------EX7");
		// print even numbers between 20 to 50
		for (int N = 20; N <= 50; N += 2) {
			System.out.print(" " + N);

		}
		System.out.println("\n----------------------------EX7----------------WAY 2");
		for (int N = 20; N <= 50; N++) {
			if (N % 2 == 0) {
				System.out.print(" " + N);
			}
		}

		System.out.println("\n\n---------------------------------EX8");
		// print odd numbers between 20 to 50
		for (int M = 21; M <= 50; M += 2)
			System.out.print(" " + M);
		System.out.println("\n---------------------------------EX9");
		
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println(" " + sum);
		System.out.println("---------------------------------EX10");
	
		// find sum of all even numbers from 1 to 100
		int sumi = 0;
		for (int ib = 2; ib <= 100; ib += 2) {
			sumi += ib;
		}
		System.out.println(" " + sumi);
	}

}