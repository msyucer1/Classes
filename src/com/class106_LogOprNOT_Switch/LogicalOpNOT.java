package com.class106_LogOprNOT_Switch;

public class LogicalOpNOT {

	public static void main(String[] args) {

		// ! ((EXCLAMATION MARK)) -> not,

		boolean a = true; // No exclamation mark
		System.out.println("The boolean value is " + a);
		System.out.println("-----------------------------------------------------------------EX 1");

		boolean snow = !true; // exclamation mark before value
		System.out.println("The weather is snow? " + snow);
		System.out.println("-----------------------------------------------------------------EX 2");

		boolean rainy = true;
		System.out.println("The weather is rainy? " + !rainy); // exclamation mark before variable
		System.out.println("-----------------------------------------------------------------EX 3");

		boolean sunny = true; // If weather is sunny I'll come to class, If not i won't
		if (!sunny) {
			System.out.println("I will come to class");
		} else {
			System.out.println("I won't come to class today"); // Else line executed because we put ! inside paranthesess and before the variable.
		}
		System.out.println("-----------------------------------------------------------------EX 4");
		int x, y;
		x = 98;
		y = 1;

		if (!(y > x)) { // first line executed cuz x is bigger than y.
			System.out.println("X is bigger than Y");
		} else {
			System.out.println("Y is bigger than X");
		}
		System.out.println("-----------------------------------------------------------------EX 5");
		
		
		
		
	}
	
}
