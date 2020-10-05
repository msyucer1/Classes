package com.class110_1DArray;

public class ArrayIntro {

	public static void main(String[] args) {

		// when we are using array we can assign same type of values in one variable.
		// Index all the time starts with zero [0]
		
		int [] array1; // declare an array //most preferred way.
		String[] array2; // or
		int array3 []; // 3 of them are correct.
		
		array1 = new int[4];	array2 = new String[2];			// initialize and create an array
		array1[0] = 10;			array2[0] ="Mehmet";			// assigning values
		array1[1] = 20;			array2[1] ="Feyza";
		array1[2] = 30;
		array1[3] = 40; 
		
		//access values
		System.out.println(array2[1]);
		
		//declaring, initializing and creating an array in same line
		int number[] = new int[2];
		number[0]=12;
		number[1]=13;
		
		// if you try assign more than value that you said compiler won't give you an error 
		// but when you execute the system, eclipse will give you ArrayIndexOutOfBoundsException error
		
	}

}
