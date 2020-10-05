package com.Class116_OOPSintro;

public class computer1 {
		
		String os, brand;
		boolean mouse, keyboard;
		int ram, secreen;
		
		public static void main(String[] args) {
			
			computer1 comp1 = new computer1();
			comp1.keyboard = true;
			comp1.mouse = true;
			comp1.os = "Windows";
			comp1.ram = 8;
			comp1.secreen = 2;
			comp1.brand = "Lenovo";
			
			System.out.println("My computer is Dell has "+comp1.os+" Operating System and "
					+comp1.ram+ "gb RAM. ");
			comp1.playGame();
			comp1.playMusic();
			comp1.watchMovie();
			System.out.println("----------------------------------------");
			
			computer1 comp2 = new computer1();
			comp2.keyboard = true;
			comp2.mouse = false;
			comp2.os = "MacOS";
			comp2.ram = 6;
			comp2.secreen = 4;
			comp2.brand = "Apple";
			System.out.println("My computer is Apple has "+comp2.os+" Operating System and "
					+comp2.ram+ "gb RAM. ");
			comp2.watchMovie();
			comp2.doJavaCoding();
			comp2.playMusic();
			System.out.println("----------------------------------------");
		}
	void watchMovie () {
		System.out.println("We can watch movie on a "+brand+" computer. "); 
	}
	void doJavaCoding () {
		System.out.println("We can do coding when we have a free time on computer");
	}
	void playMusic () {
		System.out.println("We can play music on our computer.");
	}
	void playGame() {
		System.out.println("We can play video games on the computer.");
	}


}


