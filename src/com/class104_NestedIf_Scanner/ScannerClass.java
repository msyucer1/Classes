package com.class104_NestedIf_Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		/*
		 * for String scanner next.Line
		 * for character next().CharAt(0) 
		 * for int nextInt
		 */
		
		//Let's take an number from a user and print that number
		
		Scanner Mehmet = new Scanner(System.in);
		System.out.print("please enter any number");
		int DD = Mehmet.nextInt();
		System.out.println("number which entered by you is "+DD);
		System.out.println("-----------------------------------------------------------------");
		
		Scanner UserID = new Scanner(System.in);
		System.out.print("User Name: ");
		String User = UserID.nextLine();
		System.out.println("Good Morning "+User);
		System.out.println("-----------------------------------------------------------------");
	
		Scanner StudentName = new Scanner(System.in);
		Scanner StudentNum = new Scanner(System.in);
		System.out.print("Please type student name");
		String Sname = StudentName.nextLine();
		System.out.print("Please type Student Number");
		int Snum = StudentNum.nextInt();
		System.out.println("Student name "+Sname+" and Student Number "+Snum);
		
/*		System.out.println("If this informations true Please type 'Y' if not 'N'");
		Scanner correct = new Scanner(System.in);
		String Scorrect = correct.nextLine();
		if (Scorrect.equalsIgnoreCase("y")){
				System.out.println("Access");
				System.exit(0);
		}else {
			System.out.println("Please type again");
		}
*/		System.out.println("-----------------------------------------------------------------");
		
// TAKE 2 NUMBER FROM A USER AND COMPARE THOSE NUMBERS
		
		int num1,num2;
		Scanner Number1 = new Scanner(System.in);
		System.out.print("Please enter your 1st number: ");
		num1 = Number1.nextInt();
		
		System.out.print("Please enter your 2nd number: ");
		num2 = Number1.nextInt();
		
		System.out.println("Your 1st number is "+num1);
		System.out.println("Your 2nd number is "+num2);
		
		if (num1 > num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if (num1 == num2) {
			System.out.println(num1+ " is equals to "+num2);
		}else {
			System.out.println(num1+ " is smaller than "+num2);
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		
//TYPE CITY AND TEMPERATURE OF CITY IN FAHRENHEIT AND CONVERT IT TO CELCIUS
// YOUR PROGRAM SHOULD PRINT "the temperature in the city .... is .... Celius
		
		String cityName;
		int Temp;
		Scanner CITY = new Scanner(System.in);
		System.out.print("Please enter your city name ");
		cityName = CITY.nextLine();
		System.out.print("Please enter your city temperature in Fahrenheit");
		Temp = CITY.nextInt();
		
// formula F --> C = (F-32)*5/9;
		
		int convertedTemp = (Temp-32)*5/9;
		System.out.println("the temperature of your city "+cityName+" is "+Temp+"F and "+convertedTemp+"C.");
		System.out.println("-----------------------------------------------------------------");
		
		String countryName;
		int km;
		
		Scanner COUNTRY = new Scanner(System.in);
		System.out.print("Please enter your country name: ");
		countryName=COUNTRY.nextLine();
		
		System.out.print("Please type how many km between USA and your country: ");
		km = COUNTRY.nextInt();
		
// 1 mile = 1.60934 km 
		
		float mile = km / 1.60934f;
		
		System.out.println(km+ " km or "+mile+" miles between USA and "+countryName);
		System.out.println("-----------------------------------------------------------------");
		

//KARSILASILABILECEK DURUM1
		Scanner Fire = new Scanner(System.in);
		System.out.println("Please enter your pin number: ");
		System.out.println("Please enter your user ID: ");
		int pin = Fire.nextInt();
		String ID = Fire.nextLine();
		System.out.println("Your User ID: "+ ID);
		System.out.println("Your pin No: "+ pin);
		
		// When you run your code you will see that your String code input won't work. 
		// Because at the first step you write a number for your int input and you press enter. 
		// When you press enter your string code input run and it accepted your enter like a input. 
		// Because enter means "\n" (STRING) 
		// As a result your code output doesn't show you string output. You have to fix it like this 
		
		/*Scanner Fire = new Scanner(System.in);
		System.out.println("Please enter your pin number: ");
		System.out.println("Please enter your user ID: ");
		int pin = Fire.nextInt();
		------- ---- Fire.nextLine(); --- ------
		String ID = Fire.nextLine();
		System.out.println("Your User ID: "+ ID);
		System.out.println("Your pin No: "+ pin);
		*/
		
		// Now you entered again but the input method which i added one accepted your enter as a result and you could input again.
		// The other way is changing codes priority. Write your String first and int second. 
		// It will accept your enter(\n) at the first input place and it will let you give input again as int.
		
		
		
		
		
		
		
		
		
		
	}
}
