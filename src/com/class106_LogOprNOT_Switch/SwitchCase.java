package com.class106_LogOprNOT_Switch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int day = 7;
		String DayName;

		if (day == 1) {
			DayName = "Monday";
		} else if (day == 2) {
			DayName = "Tuesday";
		} else if (day == 3) {
			DayName = "Wednesday";
		} else if (day == 4) {
			DayName = "Thursday";
		} else if (day == 5) {
			DayName = "Friday";
		} else if (day == 6) {
			DayName = "Saturday";
		} else if (day == 7) {
			DayName = "Sunday";
		} else {
			DayName = "Invalid Day";
		}
	System.out.println("Today is "+DayName);
	
	System.out.println("-----------------------------------------------------------------EX 1");
	
		
		
		System.out.println("WE ARE LEARNING SWITCH CASE");
	
	// you can use switch-case or you can use if-else They are same but not exactly
	// They have same differences. 
	// we can't use Relational operators which >< etc.in Switch Case. We just can use == or !=
	// Switch works with int,byte,short,string an char.
	
	
	int day1 = 7;
	String DayName1;
	
	switch(day1) {
	case 1:
		DayName1 = "Monday";
	break;
	case 2:
		DayName1 = "Tuesday";
	break;
	case 3:
		DayName1 = "Wednesday";
	break;
	case 4:
		DayName1 = "Thursday";
	break;
	case 5:
		DayName1 = "Friday";
	break;
	case 6:
		DayName1 = "Saturday";
	break;
	case 7:
		DayName1 = "Sunday";
	break;
	default:
		DayName1 = "Invalid Day";
	break;
	}
	System.out.println("\nToday is "+ DayName1);
	System.out.println("-----------------------------------------------------------------EX 2");
	
	// Prompt user to enter their country. Then based on the country -->> specify favorite food.
	
	String Country, Food;
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter Which country you are from: ");
	Country = scan.nextLine();
	
	switch (Country) {
	case "Turkey":
		Food = "Iskender";
		break;
	case "USA":
		Food = "Burger";
		break;
	case "Afghanistan":
		Food = "Pilav";
		break;
	case "Russia":
		Food = "Pelmeni";
		break;
	case "Morocco":
		Food = "kuskus";
		break;
	case "Kazakhstan":
		Food = "Beshparmak";
		break;
	case "Pakista":
		Food = "Biryani";
		break;
	case "Italy":
		Food = "Pasta";
		break;
	default:
		Food = "Unknown";
		break;
	}
	
	System.out.println("My favourite food is "+Food);
	System.out.println("-----------------------------------------------------------------EX 3");
	
	
	
	
	
	}
}
