package com.class111_2DArrays_AdvancedLoop;

public class SpecialLoops {

	public static void main(String[] args) { // ADVANCED LOOP;
		
// The for-each loop is used to access each successive value in a collection of values. 

		String[] name = { "mehmet", "asel", "leyla", "burak", "alex", "siyar" };
//		for (DataType variable: ArrayName)
		
		for (String student : name) {
			System.out.print(student + " ");
		}
		System.out.println("\n---------------------------------------");

		int[] ages = { 1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9 };
		for (int age : ages) {
			System.out.print(age + "- ");
		}
		System.out.println("\n---------------------------------------");

		// FOR EACH LOOP;
		int[] num = { 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int numa : num) {
			System.out.print(numa + " ");
		}
		System.out.println("\n---------------------------------------");
		double[] num1 = { 11, 12, 13, 14, 15, 16 };
		for (double num11 : num1) {
			System.out.print(num11 + " ");
		}
		System.out.println("\n---------------------------------------");
		/*
		 * TASK1 Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */

		String[] cars = { "Mustang", "Jetta", "Passat", "Altima", "Lexus", "BMW" };
		for (String carname : cars) {
			System.out.print(carname + " ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println("\n---------------------------------------");

		/*
		 * TASK2 Create an array of countries. While retrieving all values from an array
		 * print capital for each country. (use 2 different loops).
		 */

		String[] Country = { "Turkey", "France", "USA", "Germany", "Afghanistan" };
		for (int i = 0; i < Country.length; i++) {
			if (Country[i].equals("Turkey")) {
				System.out.print("Ankara ");
			} else if (Country[i].equals("France")) {
				System.out.print("Paris ");
			} else if (Country[i].equals("USA")) {
				System.out.print("DC ");
			} else if (Country[i].equals("Germany")) {
				System.out.print("Berlin ");
			} else {
				System.out.print("Kabul ");
			}
		}
		// second way
		System.out.println("\n---------------------------------------");
		String[] Country1 = { "Russia", "Spain", "Turkmenistan", "Afghanistan","Kazakhstan" };
		for (String country : Country1) {
			switch (country) {
			case "Russia":
				System.out.print("Moscow ");
				break;
			case "Spain":
				System.out.print("Madrid ");
				break;
			case "Turkmenistan":
				System.out.print("Asghabat ");
				break;
			case "Afghanistan":
				System.out.print("Kabul ");
				break;
			case "Kazakhstan":
				System.out.print("Astana ");
				break;
			}
		}
		System.out.println("\n---------------------------------------");

		/*
		 * TASK3 Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */
		int[] num12 = { 31, 24, 55, 10, 6, 41, 57, 13 };
		int sum=0;
		for (int i = 0; i < num12.length; i++) {
			sum += num12[i];
		}
		System.out.print(sum);
		System.out.println("\n---------------------------------------");
	}
}
