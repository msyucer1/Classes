package com.class108_break_Continue_Exerc;

public class ForLoopBreakContinue {

	public static void main(String[] args) {

		for (int K = 1; K <= 10; K++) {
			if (K == 5) {
				break;
			}
			System.out.print(" "+K);
		}
		System.out.println("\n-------------------------------------EX1");
		
		for (int x= 1; x <= 4; x++) {
			System.out.println("It will stop executing after printing because there is a break after println.");
			break;
		}
		System.out.println("-------------------------------------EX2");
		
		// Break: if you write a break in loops, iteration will stop when code see break point.
		// continue: if you write a cotinue in loops, when it see the point iteration will pass codes which are written
		// under the continue point and iteration will jump to beginning.
		
		for (int T = 1; T <= 20; T++) {
			if (T == 6 || T == 10 || T == 14) {
				continue;
			}
			System.out.print(" " + T);
		}
		System.out.println("\n-------------------------------------EX3");
		for (int S = 1; S <= 20; S++) {
			if (S % 3 == 0) {
				continue;
			}
			System.out.print(" " + S);
		}
		
		
	}

}
