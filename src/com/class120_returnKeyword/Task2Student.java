package com.class120_returnKeyword;

public class Task2Student {
	
	char grade;

	/*
	 * Create class student that will have a method getGrade
	 * your method should accept the score of a student and return a grade
	 * score > 90 - A
	 * score > 80 - B
	 * score > 70 - C
	 * score > 60 - D
	 * score > anything else - F
	 */
	
	
	char getGrade (int score) {
		
		if (score > 90) {
			grade = 'A';
		} else if(score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		
		Task2Student obj = new Task2Student();
		System.out.println(obj.reverse("Mehmet"));
		
		System.out.println(obj.reverse1("am"));
		
		String [] words = obj.getWords("Hello My name is Mehmet");
		for (String arr : words) {
			System.out.println(arr);
		}
	}
	
	/* Create a method that will take 1 parameter as a String and return reversed String. 
	 * Method should be visibly only within same package. */
	
	protected String reverse (String word) { 
		String reversed = "";
		for (int i = word.length() - 1; i>=0 ; i--) {
			reversed = reversed + word.charAt(i);
		}
		return reversed;
	}
	

	/* Create a method that will take a String and return whether String is palindrome or not. 
		Method should available to all classes within your projects. */
	
	
	public boolean reverse1 (String word) { 
		String palindrome = "";
		
		String reversed = reverse(word);
		if (reversed.equalsIgnoreCase(word)) {
				return true;
			}
		
		return false;
		
	}
	
	/* Create a method that will take a string and return array of words from that string. 
		Method should be available only within same class. */
	
	private String [] getWords (String str) {
		String [] words = str.split(" ");
		return words;
	}
	
}
