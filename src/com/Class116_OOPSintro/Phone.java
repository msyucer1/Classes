package com.Class116_OOPSintro;

public class Phone {
	
	String brand, model, os;
	int RAM, processor;
	boolean bluetooth, touchScreen;
	
	public static void main(String[] args) {
		Phone Ph = new Phone();
		Ph.bluetooth = true;
		Ph.brand = "iPhone";
		Ph.model = "8 Plus";
		Ph.os = "IOS";
		Ph.processor = 4;
		Ph.touchScreen = true;
		Ph.RAM = 6;
		System.out.println("My Phone is "+Ph.brand+" "+Ph.model+". "
				+ "It has "+Ph.processor+" processors and "+Ph.RAM+" gb RAM.");
		Ph.playMusic();
		Ph.watch4Kvideo();
		Ph.touch();
		System.out.println("----------------------------------------------");
		
		Phone Ph1 = new Phone();
		Ph1.bluetooth = false;
		Ph1.brand = "Samsung";
		Ph1.model = "Galaxy S8+";
		Ph1.os = "Android";
		Ph1.processor = 4;
		Ph1.touchScreen = true;
		Ph1.RAM = 6;
		System.out.println("My Phone is "+Ph1.brand+" "+Ph1.model+". "
				+ "It has "+Ph1.processor+" processors and "+Ph1.RAM+" gb RAM.");
		Ph1.playMusic();
		Ph1.touch();
		System.out.println("----------------------------------------------");
		
		Phone Ph2 = new Phone();
		Ph2.bluetooth = false;
		Ph2.brand = "Nokia";
		Ph2.model = "3310";
		Ph2.os = "We don't know";
		Ph2.processor = 0;
		Ph2.touchScreen = false;
		Ph2.RAM = 1;
		System.out.println("My Phone is "+Ph2.brand+" "+Ph2.model+". "
				+ "It has "+Ph2.processor+" processors and "+Ph2.RAM+" gb RAM.");
		Ph2.throw1();
		System.out.println("----------------------------------------------");
		
	}
	void playMusic () {
		System.out.println("You can play music on spotify with this phone");
	}
	void watch4Kvideo() {
		System.out.println("You can watch video with 4K quality in this phone");
	}
	void Blue () {
		System.out.println("You can share whatever you want via bluetooth in this phone.");
	}
	void throw1 () {
		System.out.println("You can throw this phone to somebody's head whoever you want to kill");
	}
	void touch () {
		System.out.println("You can touch the screen as many as you want.");
	}

}
