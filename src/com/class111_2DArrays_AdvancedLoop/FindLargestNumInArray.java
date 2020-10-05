package com.class111_2DArrays_AdvancedLoop;

public class FindLargestNumInArray {
	public static void main(String[] args) {

		// create an array of integers and find the largest number
		// INTERVIEW QUESTION

		int[] Numbers = { 100, 2, 23, 34, 45, 56, 67, 78, 300, 90, 51 };

		int max = Numbers[0];
		for (int i = 0; i < Numbers.length; i++) {
			if (max < Numbers[i]) {
				max = Numbers[i];
			}
		}
		System.out.print(max);

		System.out.println("\n---------------------------------------");
		int[] val = { 1020, 203, 456, 212, 987, 999, 968, 757, 1111, 1 };
		int smallest = val[0];

		for (int i = 0; i < val.length; i++) {
			if (smallest > val[i]) {
				smallest = val[i];
			}
		}
		System.out.println("The smallest number is " + smallest);

	}
}
