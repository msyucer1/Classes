package com.classReview3;

public class Vowals {
	
	/* create a method that shows you all the vowals in a string
    * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
    * this method can have any string value you put in, but must return all the vowals within the string */
	
	String str1;
	
	public static void main(String[] args) {
		
		Vowals str = new Vowals();
		str.str1 = "hello world my name Is Mehmet";
		str.str2();
		str.replace();
		
	}void str2 (){
		char [] strChar = str1.toCharArray();
		char empty = 0;
		for (int i=0; i<strChar.length; i++) {
			if (
			  strChar[i] =='a'||strChar[i] =='A'
			||strChar[i] =='e'||strChar[i] =='E'
			||strChar[i] =='i'||strChar[i] =='I'
			||strChar[i] =='o'||strChar[i] =='O'
			||strChar[i] =='u'||strChar[i] =='U') {
				empty = strChar[i];
				System.out.print(empty+" ");
				
			}
		}System.out.println();
	}
	void replace () {
		String rep = str1.replaceAll("[^aAeEiIuUoO]", "");
		System.out.print(rep);
	}

}
