package com.classReview2;

public class NestedLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that prints the following pattern
					1 2 3 4 5 6 7 8 9 10
                    2 4 6 8 10 12 14 16 18 20
                    3 6 9 12 15 18 21 24 27 30
                    4 8 12 16 20 24 28 32 36 40
                    5 10 15 20 25 30 35 40 45 50
		 */
		
		for (int x = 1; x <= 5; x++) {
			for (int y = x; y <= (10 * x); y += x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");
		for (int i=1 ; i<=5; i++) {
			for(int x=1; x<=(5-i); x++) {
				System.out.print(".");
			}for (int l=1; l<=i; l++) {
				System.out.print(i);
			}
		System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		for (int i=1; i<=5; i++) {
			for(int t =1 ; t<=(5-i); t++) {
				System.out.print("*");
			}
		System.out.println(i);
		}
	
		/**
	        * Write a program to produce the following pattern
	        *
					....1
					...2.
					..3..
					.4...
					5....
	        */
		
		
	}
}
