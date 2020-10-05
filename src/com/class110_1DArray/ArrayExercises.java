package com.class110_1DArray;

public class ArrayExercises {

	public static void main(String[] args) {

		String[] names = {"Mike","Asel","Siyar","Mhmt","Myahri","Talgat","Ali"};
		
		int size  = names.length;
		for (int i = 0; i<size; i++) {
			System.out.print(names[i]+"/ ");
		}
		System.out.println("\n---------------------------------------------------");
		
		char [] grades = {'A','B','C','D','E','F'};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
	}

}
