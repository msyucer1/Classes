package com.class111_2DArrays_AdvancedLoop;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// using new keyword. 1st way:

		int[][] numbers = new int[3][2];
		// 1st row
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		// 2nd row
		numbers[1][0] = 3;
		numbers[1][1] = 4;
		// 3rd row
		numbers[2][0] = 5;
		numbers[2][1] = 6;

		// without new keyword
		// 					Row 1 				Row 2 			Row 3 				Row 4
		int[][] e = { { 12, 13, 14, 15 }, { 1, 2, 3, 4 }, { 5, 10, 15, 20 }, { 100, 200, 300, 400 } };
		System.out.println(e[0][2]);
		System.out.println(e[1][2]);
		System.out.println(e[2][2]);
		System.out.println(e[3][1]);

		System.out.println("---------------------------------");
		String[][] A = { { "Aydar", "Haydar", "Ajdar", "Siyar", "Sahar" },
						{ "Asel", "Sumair", "Mehmet", "Arif", "ali" } };
		System.out.println(A[0][2]);
		System.out.println(A[1][3]);

		System.out.println("---------------------------------");
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,Miss 
		 * and Smith, Jordan, Jackson, Obama. After storing values print the following:
		 * Mrs Smith, Mr Obama, Ms Jackson.
		 */
		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };
		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);

		System.out.println("---------------------------------");
		
		/*
		 * Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has as an A and B grade
		 */
		String[][] Graders = { { "Mehmet", "Ahmet", "Cafer", "Omer" }, { "A", "B" } };
		System.out.println(Graders[0][0] + " " + Graders[1][0]);
		System.out.println(Graders[0][1] + " " + Graders[1][1]);
		System.out.println(Graders[0][2] + " " + Graders[1][1]);
		System.out.println(Graders[0][3] + " " + Graders[1][0]);
	}
}
