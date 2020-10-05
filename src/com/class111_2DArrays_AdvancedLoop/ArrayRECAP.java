package com.class111_2DArrays_AdvancedLoop;

public class ArrayRECAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = new String [6] ;
		names [0] = "Mehmet";
		names [1] = "Siyar";
		names [2] = "Bekir";
		names [3] = "Ahmet";
		names [4] = "Tufan";
		names [5] = "Omer";
//		names [6] = "Arif"; --	ArrayIndexOutOfBoundsException !! 
		
		for (int i = 0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println("\n-----------------------------------");
		
		String[] Name = {"Mehmet", "Myahri", "Asel","David","Siyar","Tetiana"};
		for (int i = 0; i<= Name.length-1; i++) {
			System.out.print(Name[i]+" ");
		}
		
		
		
		
	}

}
