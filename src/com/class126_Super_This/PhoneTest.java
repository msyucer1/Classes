package com.class126_Super_This;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("-----Object of parent class-----");
		Phone ph = new Phone();
		ph.hasCamera();
		ph.makeCall();
		
		System.out.println("-----Object of iPhone class-----");
		iPhone IP = new iPhone();
		IP.hasCamera();
		IP.makeCall();
		
		System.out.println("-----Object of Samsung class-----");
		Samsung sm = new Samsung();
		sm.hasCamera();
		sm.makeCall();
	
		System.out.println("-----Object of Nokia class-----");
		Nokia N = new Nokia();
		N.hasCamera();
		N.makeCall();
		
		System.out.println("-----Object of Polymorphism class-----");
		Phone pph = new iPhone();
		pph.makeCall();
		pph.hasCamera();
		
		System.out.println("-----Object of Polymorphism2 class-----");
		Phone pph1 = new Samsung();
		pph1.makeCall();
		pph1.hasCamera();
				
		System.out.println("-----Object of Polymorphism3 class-----");
		Phone pph2 = new Nokia();
		pph2.makeCall();
		pph2.hasCamera();
		// pph2.UnBreakable(); -->> Cannot accessable because it is specificly child class.
		
		
		//Creating a variable of a ParentType;
		Phone ParentPh;
		//Accessing Objects.
		ParentPh = new iPhone();
		ParentPh = new Samsung();
		ParentPh = new Nokia();
				
		
		
		
	}
}
