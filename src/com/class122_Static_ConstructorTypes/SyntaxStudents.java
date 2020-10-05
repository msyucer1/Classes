package com.class122_Static_ConstructorTypes;

public class SyntaxStudents {

	/*
	 * schoolName
	 * batchNumber
	 * studentName
	 * studentLastName
	 * 
	 * method getStudentDetails
	 *  
	 */
	
	public static String schoolName = "Syntax";
	public static int batchNumber = 4;
	public String studentName;
	public String studentLastName;
	
	public static void main(String[] args) {
		
//		SyntaxStudents obj = new SyntaxStudents();
//		obj.getStudentDetails();
//		
	}
	
	public void getStudentDetails() {
		String details = "I am a student at "+schoolName+" from batch "+batchNumber+" and my name is "+studentName+" "
				+studentLastName;
		System.out.println(details);
	}
	
	// LETS TRY WITH CONSTRUCTOR
			
	public SyntaxStudents (String name, String LastName) {
			studentName = name;
			studentLastName = LastName;
				
				
	}
	
}
