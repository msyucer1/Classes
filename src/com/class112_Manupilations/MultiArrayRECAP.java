package com.class112_Manupilations;

public class MultiArrayRECAP {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, { 10, 20, 30 }, { 15, 25, 35 } };

		for (int i = 0; i < array.length; i++) {
			for (int b = 0; b < array[i].length; b++) {
				System.out.print(array[i][b] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		System.out.println("-FOR EACH LOOP-");
		for (int[] singleArray : array) { // we have 2D array. If we want to access these successive values 
											// row by row. we need to convert arrays 2D to 1D
			for (int numbers : singleArray) { // and then we need to convert 1D array to numbers or strings then 
												// we can return them or retrieve them.
				System.out.print(numbers + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		/*
		 * TASK; Create a grocery lists: fruits{}, veggies{},dairy{} Retriev all values
		 * using 2 different loops.
		 */

		String[][] grocery = { { "oranges", "grapefruits", "mandarins" },
				{ "cabbage", "cauliflower", "Brussels sprouts" }, { "yogurt", "milk", "egg" } };

		for (int i = 0; i < grocery.length; i++) {
			for (int b = 0; b < grocery[i].length; b++) {
				System.out.print(grocery[i][b] + " ");
			}
			System.out.println();
		}
		System.out.println("------------2ND WAY---------------");
		
		for (String [] gro : grocery) {
			for (String gro1 : gro) {
				System.out.print(gro1+" ");
			}
			System.out.println();
		}
		
	}

}
