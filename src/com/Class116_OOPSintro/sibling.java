package com.Class116_OOPSintro;

public class sibling {

	String eyeColor, hairColor;
	int fingers;
	boolean face,arms, legs;
	
	public static void main(String[] args) {
		sibling bro = new sibling ();
		bro.arms = true;
		bro.eyeColor = "hazal";
		bro.face = false;
		bro.fingers = 7;
		bro.hairColor = "white";
		
		System.out.println("My brother's hair is "+bro.hairColor+" and his eye's color is "+bro.eyeColor);
		bro.play();
		bro.sing();
		bro.Vacation();
		
	}
	
	void play () {
		System.out.println("we can play games with my brother.");
	}
	void Vacation() {
		System.out.println("we can go on a vacation with my brother.");
	}
	void sing () {
		System.out.println("We can not sing with him because his voice is bad");
	}
}
