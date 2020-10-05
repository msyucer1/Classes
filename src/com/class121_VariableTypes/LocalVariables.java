package com.class121_VariableTypes;

public class LocalVariables {

	public static void main(String[] args) {
		LocalVariables obj = new LocalVariables();
		String name = "Profesor";
		System.out.println(name);
		obj.hello("Mehmet");
	}
	
	public void hello (String name) {
		name = "Omer";
		System.out.println("Hello "+name);
	}
}
