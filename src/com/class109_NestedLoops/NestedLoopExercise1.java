package com.class109_NestedLoops;

public class NestedLoopExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 123456	--> 4 rows and 6 columns
		 * 123456
		 * 123456
		 * 123456 
		 */
		
		for (int i = 1; i <= 4; i++) {
			for (int x = 1; x <= 6; x++) {
				System.out.print(x);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		/*
		 * 111111	--> 7 rows and 6 columns
		 * 222222
		 * 333333
		 * 444444
		 * 555555
		 * 666666
		 * 777777
		 * 
		 */

		for (int b = 1; b <= 7; b++) {

			for (int a = 1; a <= 6; a++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		/*
		 * *****	--> 4 rows and 5 columns
		 * *****
		 * *****
		 * *****
		 */
		
		for (int a = 0; a < 5; a++) {

			for (int b = 0; b < 7; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------");
		
		/*
		 * 54321	--> 5 rows and 5 columns
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for (int a = 1; a<6; a++) {
			for (int b=5; b>0; b--){
				System.out.print(b);
			}
		System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		/*
		 * 55555	--> 5 rows and 5 columns
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		
		for (int x = 5; x>0; x--) {
			
			for (int y = 5; y>0; y--) {
				
				System.out.print(x);
			}
		System.out.println();
		}
		
		System.out.println("------------------1ST WAY-------------------");
		
		/*
		 * 		*			print this pattern
				**
				***
				****
				*****
		 */
		for (int x = 1; x <=5; x++) { 	// rows	
			System.out.println("*");
			if (x==5) {
				break;
			}
			for (int y = 1; y <= x; y++) {		// columns
				System.out.print("*");
			}
		}
		System.out.println("------------------2ND WAY-------------------");
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
		}
		System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		/*
		 *  ******	--> 4 rows 6 columns
		 *  *	 *
		 *  *	 *
		 *  ******
		 */
	
		for (int i =1; i<=4;i++) {
			for (int t = 1; t<=6; t++) {
				if (i == 2 && t > 1 && t<6) {
					System.out.print(" ");
					continue;
				}else if (i ==3 && t > 1 && t<6) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
