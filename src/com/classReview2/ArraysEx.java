package com.classReview2;

public class ArraysEx {
	public static void main(String[] args) {

		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i : array) {		//"foreach" method. We are using it when we print whole values.
			System.out.print(i+" ");
		}
		System.out.println("\n-------------------------------------");
		String [] array2 = {"Seni","istiyorum","yanimda","bu","durum","beni","mahvedecek."};
		
		for(String a : array2) {
			System.out.print(a+" ");
		}
		System.out.println("\n-------------------------------------");
		
		double [] array3 = {0.4,0.6,2,1.8};
		for (double d : array3) {
			System.out.print(d + " ");
		}
		
		
		
	}
}
