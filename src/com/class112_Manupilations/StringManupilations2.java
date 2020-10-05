package com.class112_Manupilations;

public class StringManupilations2 {

	public static void main(String[] args) {

		/*
		 * .charAt(intINDEX)	--->> it will return a letter which stored in index number.
		 * .indexOf()			--->> it will return a index of specified character. (letter - word - -1)
		 * .substring(BeginINDEX)-->> it cuts sentence from place which specified by you as an index. 
		 *  							New sentence will start at index number.
		 *  
		 *  
		 *  
		 *  
		 */
		
		System.out.println("------------------------FIND LETTER BY INDEX");
		String A1 = "Students";
		char character = A1.charAt(2); // we wrote char because system will return us a letter and letter is a char.
		System.out.println(character); //it will return a letter which stored in index 2
		
		for (int i = 0; i < A1.length(); i++) {
			System.out.print(A1.charAt(i) + " "); // it will return whole letters one by one.
		}
		System.out.println("\n------------------------FIND INDEX BY LETTER");
		
		String A2 = "Sunday";
		int index = A2.indexOf("n"); // we declare int because system return us a number.
		System.out.println(index);
		String A3 = "Monday and sunday";
		System.out.println(A3.indexOf("and")); //it finds the word and if it is equal it assign entire word to first index.
		System.out.println(A3.indexOf(" "));
		System.out.println(A3.indexOf("K")); //if there is no equality with any letters or words it returns -1
		System.out.println("------------------------SUBSTRING");
		
		String A4 = "Today is Sunday Java Class";
		String newString = A4.substring(6);
		System.out.println(newString); 				// is Sunday Java Class
		System.out.println(A4.substring(6,8)); 		// is
		System.out.println(A4.substring(16,20)); 	// Java
		System.out.println(A4.substring(21)); 		// Class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
