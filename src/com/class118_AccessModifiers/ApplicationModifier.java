package com.class118_AccessModifiers;

import com.Class117_Methods.CalculatorForPack17_2;
import com.Class117_Methods.MethodInJava;

public class ApplicationModifier {

	public static void main(String[] args) {

		ScannerMethod obj = new ScannerMethod();
		
//		obj.printNumbers();  //PRIVATE
//		It is not visible because it is private method
		
		obj.name(); //PROTECTED
		
		NestedLoopHomeworks2 obj1 = new NestedLoopHomeworks2();  
		obj1.printPattern(); // DEFAULT
	
		MethodInJava obj2 = new MethodInJava(); //DIFFERENT PACKAGE'S(117) CLASS
		obj2.hello(); // PUBLIC METHOD
	
	System.out.println("------------------------------------------");
	
		CalculatorForPack17_2 object = new CalculatorForPack17_2();
		System.out.println(object.sum(12, 32));
	}

}

		