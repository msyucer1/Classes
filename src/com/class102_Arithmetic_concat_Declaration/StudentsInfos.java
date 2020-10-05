package com.class102_Arithmetic_concat_Declaration;

public class StudentsInfos {

	public static void main(String[] args) {
		
		/*TASK;
		 * 	Create a java program ad name it variables
		 * 		In your program create variables to store students information
		 * 		name
		 * 		last name
		 * 		Grade
		 * 		exam grade
		 * 		City
		 * 		State
		 * 		Phone number
		 */
		
		String name = "Mehmet";
		String lastName = "YUCER";
		Byte Grade = 1;
		char examGrade = 'A';
		String City = "Fairfax";
		String State = "Virginia";
		Long PhoneNumber = 5713318677l;
				
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(Grade);
		System.out.println(examGrade);
		System.out.println(City);
		System.out.println(State);
		System.out.println(PhoneNumber);

		System.out.println("Please check your informations again \r"); 
		// if you write \r & \n at the end of the double quote's inside, it will space between two lanes.
		
		System.out.println("Your information starts as; \n");
		System.out.println( name + " " + lastName + " " + "Grade " + Grade + "Exam Grade " + examGrade + " " + City + " " + State + " " + PhoneNumber);

		System.out.print(name);
		System.out.print(lastName);
					
	}

}
