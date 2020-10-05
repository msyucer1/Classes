package com.class123_inheritance_Overloading;

public class InhEmployee {

	public static String department = "IT";
	int salary;
	protected int salary1;

	public void getPaid() {
		System.out.println("Employee gets paid: $" + salary);
	}

	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
}
