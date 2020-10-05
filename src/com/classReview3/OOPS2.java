package com.classReview3;

import java.util.Scanner;

public class OOPS2 {

	String eyes, tshirt;
	
	public static void main(String[] args) {
		
		OOPS2 newC = new OOPS2 ();
		newC.eyes = "red";
		newC.tshirt = "blue";
		System.out.println(newC.eyes);
		newC.ScannerFirstName();
		newC.noReturn();
		newC.ScannerInt();
		
	}
		
		
	void ScannerFirstName () {
		Scanner name = new Scanner (System.in);
		name.nextLine();
	}
	void noReturn() {
		System.out.println("I do not havea return type.");
	}
	void ScannerInt () {
		Scanner scan = new Scanner (System.in);
		scan.nextInt();
	}
}
