package com.class127_Abstraction;

public abstract class Phone {

	 public void makeCall() {
		 System.out.println("Phone can make a call");
	 }
	 
	 public void sendMessage() {
		 System.out.println("Phone can send a message");
	 }
	
	 public abstract void unlockPhone();
	 		// I don't want to add behavior now.
	 public abstract void viewPictures();
}

class iPhone extends Phone { //concrete class is class that is inherited from a abstract class or 
				//	 implemented by interface and providing implementation of all unimplemented / abstract class

	public void unlockPhone() {
		System.out.println("To unlock iPhone we can use FaceId or FingerPrint");
	}

	public void viewPictures() {
		System.out.println("To view pictures on iPhone can go to images");
	}
}

class Samsung extends Phone {

	public void unlockPhone() {
		System.out.println("To unlock Samsung you need to enter password");
	}

	public void viewPictures() {
		System.out.println("To view pictures we have to go to gallery");
	}
}