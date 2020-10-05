package com.classReview3;

public class ReverseString {

	String a = "Sysntax Technologies";
	String reverse = "";
	
	public static void main(String[] args) {
		/* Create a String method called ReverseString
         *  method return the string you hard coded
         * in reverse order(This is the static way)
         * have the string you will create will say
         *  "seigolonhceT xatnyS"
         */
		
		ReverseString task1 = new ReverseString();
		task1.reverseString();
		task1.reverseString1();
		
		
	}
	void reverseString () {
		for (int i = a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		} }
	void reverseString1() {
	    String str="seigolonhceT xatnyS";
	    String reverse="";
	    for(int i=str.length()-1;i>=0;i--) {
	         reverse=reverse+str.charAt(i);
	         System.out.println(reverse);
	        }
	      //System.out.println(reverse);
	  
	    
		
	}
	
}
