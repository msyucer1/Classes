package com.class125_Final_TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Implicit/Automatic/Widening --> Compiler takes care of conversion.
		double a = 10;
		System.out.println(a);
		
		//Explicit/Manual/Narrowing	-->> Programmer takes care of conversion
		double b = 10.0;
		int c = (int)b;
		System.out.println(c);
		// System.out.println((int)b);
		
		int d = 130;
		byte by = (byte)d;
		System.out.println(by);
		// byte by =130; -->> Compiler doesn't allow;
		// System.out.println((byte)d);
		
		
		// UpCasting -->> Compiler takes care of this conversion
		Payment pay = new MasterCard();
		
		//MasterCard mc = new Payment(); -->> Compiler won't allow.
		// DownCasting -->> Programmer takes care of conversion.
		MasterCard mc = (MasterCard)new Payment();
	
	
	}
}
