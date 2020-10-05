package com.class127_Abstraction;

public class PhoneTest {

	public static void main(String[] args) {
		
//		Phone obj = new Phone(); Comp. Error: can not instantiate Phone class cuz it is an abstract class.
		Phone obj = new iPhone();
		obj.makeCall();
		obj.sendMessage();
		obj.unlockPhone();
		obj.viewPictures();
		
		System.out.println("-------------------------------------------------");
		Phone obj1 = new Samsung();
		obj1.makeCall();
		obj1.sendMessage();
		obj1.unlockPhone();
		obj1.sendMessage();
		
	}
	
}
