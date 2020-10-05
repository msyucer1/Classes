package com.class110_1DArray;

public class ArrayCreation {

	public static void main(String[] args) {
					//0,  1,  2,  3
		int[] array= {10, 20, 30, 40};
		
		System.out.println(array[3]);
		
		System.out.println(array.length); 
		// when we want to learn that how many value assigned to array we are writing ".length" extension.
		System.out.println("------------------------------------");
		
		String[] names = {"Mike", "Myahri", "Talgat", "Olga", "Siyar"};
		System.out.println(names[3]);
		System.out.println(names.length);
		System.out.println("------------------------------------");
		
//		1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).

		char[] grades = {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		char[] grade = new char [6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[5]);
		System.out.println("------------------------------------");
		
//		2.Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).

		String [] namess = {"David","Tetiana","Manel","Aigherim","Mehmet"};
		System.out.println(namess[2]+" "+namess[3]);
		
		String [] namesss = new String [5];
		namesss[0] = "Manel";
		namesss[1] = "Aigherim";
		namesss[2] = "Tetiana";
		namesss[3] = "David";
		namesss[4] = "Mehmet";

		System.out.println(namesss[1]+" "+namesss[3]);
		System.out.println("------------------------------------");
		
//		3.Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using element of array: “Saturday is Java coding Day”.
		
		String [] words = {"Saturday","is","Java","coding","day."};
		System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
		
// or
		
		for (int i = 0; i<5; i++) {
			System.out.print(words[i]+" ");
		}
		
		String [] wordss = new String[5];
		wordss [0]="Saturday";
		wordss [1]= " is";
		wordss [2]= " Java";
		wordss [3]= " coding";
		wordss [4]= " day.";
		System.out.println("\n"+ wordss [0]+wordss [1]+wordss [2]+wordss[3]+wordss [4]);
		
		
		
	}

}
