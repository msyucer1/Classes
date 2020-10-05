package com.class113_String_SplitReverseReplace;

public class StringTask1_replace_reverse {

	public static void main(String[] args) {

		/*	.replace ("OldChar","NewChar")		-->> will replace old character to new character
		 *  .replaceAll ("OldChar","NewChar") 	-->> will look all characters to change, except what you defined.
		 *  .toCharArray() 		-->> changes string to array by letters.
		 *  .Split("")			-->> Splits the string around matches 
		 */
	
		String str = "I am a good tester! #1";
		String newstr = str.replace("a", "e");
		System.out.println(newstr);
		
		String newStr1 = str.replace("good", "great");
		System.out.println(newStr1);
		
		System.out.println(str.replace("tester", "programmer"));
		
		System.out.println(str.replace("Tester", "programmer"));
			// All string manipulations are case sensitive. Because of this last replace method doesn't work
		
		str = str.replace("!", "?");
		str = str.replace("#1", "#2");
		System.out.println(str);
		
		System.out.println("------------------------------------------");
		
		String str2 ="12Hello 32323World 63474%^$#";
		String replacedNoNumbers = str2.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newStr= replacedNoNumbers.replaceAll("[a-z]", "");
		System.out.println(newStr);
		// It gives us H W &^%$ Because method is case sensitive so it doesn't cover upper cases.
		
		String newStr2= replacedNoNumbers.replaceAll("[A-Za-z]", "");
		System.out.println(newStr2);
		// Here we said that change letters to nothing
		
		String newStr3= replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newStr3);
		// ^ means that nothing without []
		// We added this before letters and we said that take nothing except letters.
		
		String str3 = "0Hello W12orl3d";
		System.out.println(str3.replaceAll("[^0-9]", ""));
	
		System.out.println("\n------------------------------------------");
	
		String str4 = "saturday";
		char [] array = str4.toCharArray();
		for (int i = 0; i <array.length; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (char letters : array) {
			System.out.print(letters);
		}
		System.out.println();
		System.out.println("Printing in reverse");
		for (int i = array.length-1; i>=0 ; i--) {
			System.out.print(array[i]+" ");
		}
	
		System.out.println("\n------------------------------------------");
		// Reverse a String without Reverse function
		System.out.println("----1ST WAY----ToCharArray");
		String str6 = "Today is Java Class";
		String reverse = "";
		char[] array123 = str6.toCharArray();
		for (int i = array123.length-1; i>=0 ; i--) {
			reverse = reverse+array123[i];
		}
		System.out.println(reverse);
	
		System.out.println("----2ND WAY----CharAt");
		String reverse2 ="";
		for (int i = str6.length()-1; i>=0; i--) {
			reverse2 = reverse2+str6.charAt(i);
		}
		System.out.println(reverse2);
		System.out.println("----3RD WAY----SubString");
		
		String reverse3 ="";
		for (int i = str6.length(); i>0 ; i--){
			reverse3 = reverse3+str6.substring(i-1,i);
			
		}
		System.out.print(reverse3);
		System.out.println("\n------------------------------------------");
		
		String str7 = "Welcome Syntax Students Batch 4";
		String [] array7 = str7.split("[Ss]");
		System.out.println("The length of the array is: "+array7.length);
		for (String substring : array7) {
			System.out.println(substring);
		}
		System.out.println("------");
		String str8 = "Welcome Syntax Students Batch 4";
		String [] array8 = str7.split(" ");
		for (int i = 0; i < array8.length; i++) {
			System.out.print(array8[i]+" ");
		}
		
		
	}
}
