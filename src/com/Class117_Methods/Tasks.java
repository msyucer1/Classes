package com.Class117_Methods;

public class Tasks {

	public static void main(String[] args) {

		Tasks obj = new Tasks();
		
		System.out.println(obj.largest (40,35));
		
		System.out.println(obj.evenOdd(55));
		obj.Palindrome("Said"); //argument
		obj.Array();
	}
	
	int largest (int a, int b) { // parameter
		int largest;
		if (a>b) {
			largest = a;
		}else {
			largest = b;
		}
		return largest;
		
	}
	
	String evenOdd (int a) {
		String number;
		if (a % 2 == 0) {
			number = "Even";
		}else {
			number = "Odd";
		}
		return number;
	}
	
	void Palindrome (String word) {
		String reverse="";
		for (int i = word.length()-1; i>=0 ; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("This word is Palindrome!");
		}else {
		System.out.println("This word is not Palindrome try different words");
		}
	}
	void Array () {
		int [][] Array = { { 2,3,4,5},{159,357,654,852},{95,96,36,26,45},{987,654,321,789,456}};
		int max = Array[0][0], SecLarg = 0;
		for (int [] arr : Array) {
			for(int arr1 : arr) { 
				if (max < arr1) {
					max = arr1;
				}
				if (SecLarg < arr1 && arr1 < max) {
					SecLarg = arr1;
				}
			}
		}
		System.out.println("The Biggest number in this array is "+max+" "
				+ "and the second largest number in this array is "+SecLarg);
		
	}


}
