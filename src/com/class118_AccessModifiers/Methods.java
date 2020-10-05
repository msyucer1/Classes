package com.class118_AccessModifiers;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {

		Methods obj = new Methods();
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int t = scan.nextInt();
		
		obj.Math(i,t);
		obj.name("Mehmet");
	}

	void name (String name1) {
		System.out.println(name1); 
	}

	int Math(int c, int f) {
		System.out.println(c+f);
		return c+f;
	}

}
