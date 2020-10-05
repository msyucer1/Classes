package com.class126_Super_This;

public class Phone {

	public void makeCall() { // overridden
		System.out.println("This phone can make a call");
	}

	public void hasCamera() {
		System.out.println("This phone has a camera");
	}

}

class iPhone extends Phone {

	public void makeCall() { // overriding
		System.out.println("iPhone can make a faceTime");
	}

	public void hasCamera() {
		System.out.println("iPhone has a dual HD camera");
	}
}

class Samsung extends Phone {

	public void hasCamera() {
		System.out.println("Samsung has 3 lenses camera");
	}
}

class Nokia extends Phone {
	public void hasCamera() {
		System.out.println("Nokia has no camera");
	}
	
	public void UnBreakable () {
		System.out.println("Nokia phones are unbreakable");
	}
}