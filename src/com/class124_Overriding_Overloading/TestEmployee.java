package com.class124_Overriding_Overloading;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ftemp = new FullTimeEmployee();
		Contractor cons = new Contractor();
		PartTimeEmployee ptEmp = new PartTimeEmployee();
		
		emp.getPaid(); 
		ftemp.getPaid(); // same method name with parent class but ftemp choose it's own behavior 
		cons.getPaid();
		ptEmp.getPaid();
		
	}
}
