package com.class111_2DArrays_AdvancedLoop;

public class RetrievingAllValuesMultiDim {

	public static void main(String[] args) {

		int[][] array = { { 3, 2, 1, 4, 5 }, { 5, 6, 7, 8, 9 }, { 0, 3, 4, 5, 7 } };

		// how many rows do you have?
		int rows = array.length;
		System.out.println("row: " + rows);

		// row's length.
		int cols = array[0].length;
		System.out.println("column: " + cols);

		int size = cols * rows;
		System.out.println("element: " + size);

		System.out.println("---------------------------------------");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
				if (col == 4) {
					System.out.println();
				}
			}
		}
		System.out.println("---------------------------------------");

		String[][] food = { { "burger", "hotdog", "meatloaf", "fries" }, 
						{ "fried rice", "lo mein" },
						{ "biriyani", "korma", "naan", "chick peas" } };
		for (int i = 0; i < food.length; i++) {
			for (int a = 0; a < food[i].length; a++) {
				System.out.print(food[i][a] + " - ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
	
		// TASK 
		// Create an array of cars: american,italian,korean,german. Then retrieve all values from that array.
		String [][] cars = {{"Toyota","Kia","Hyundai","Mitsubishi"},
				{"Lexus","Ford","Scania"},
				{"Mercedes","BMW","Volkswagen","Porshe"},
				{"Lamburghini","Maserati"}};
		
		for (int i = 0; i<cars.length; i++) {
			for ( int b = 0; b<cars[i].length;b++) {
				System.out.print(cars[i][b]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		// TASK2
		/* Create an array of countries: north America countries, 
		 * SA Countries, European Countries, Asian Countries and African Countries.
		 * Then print all values from that array. */
		
		String[][] country = {{"USA","Mexico","Cuba","Canada","Dominian Rep."},
				{"Brazil","Venezuela","Argentina","Colombia"},
				{"Germany","France","Spain","Turkey","UK"},
				{"Japan","India","China","Vietnam","Thailand","Singapore"},
				{"Nigeria","Kenya","Morocco","Ghana"}};
		for (int t =0; t<country.length;t++) {
			for(int y = 0; y<country[t].length;y++) {
				System.out.print(country[t][y]+" ");
			}
			System.out.println();
		}
System.out.println("---------------------------------------------");
		for (String [] name : country) {
			for (String country1 : name) {
				System.out.println(country1);
			}
		}
		
	}
}
