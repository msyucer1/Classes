package com.class103_IfElse_RelationalOps;

public class newThingSometing {

	public static void main(String[] args) {

		/////////Parentheses, Exponents, Multiplication/Division, Modulus, Addition/Subtraction
		
		int a = 30;
		int b = 20;
		String c = "hello";
		String d = "Bye";

		System.out.println(a+b+c+d);	// at here a+b is int variables. it shows us int + string
		System.out.println(b+c+a+d); 
		System.out.println(c+a+d+b);
		System.out.println(c+d+a+b);	// but here it accepts that String + String. we add hello(str) + Bye(str) + 30(int) = helloBye30(STRING)
										// then we are adding b=20 (int) ==> helloBye30(str)+20(int) = helloBye3020(STRING)
		System.out.println(c+d+(a+b));	// Here we are adding two string to each and two int to each and we bring them together. HelloBye50
		
		System.out.println("-----------------------------------------------------------------\n");

		//MODULUS OPERATOR (%)
		int x = 70;
		int y= 6;
		System.out.println(x%y);
		x = 65123;
		y = 23;
		System.out.println(x%y);
		x = 2^5;
		y = 3;
		System.out.println("x= "+x);
		System.out.println(x%y);
		
		int k = 20 + -5*12 / 5;
		System.out.println(k);
		int m = 5 + 15/3*2-8%3;
		System.out.println(m);
		
		
	}

}
