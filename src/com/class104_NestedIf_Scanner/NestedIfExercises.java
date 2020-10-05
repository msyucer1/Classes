package com.class104_NestedIf_Scanner;

import java.util.Scanner;

public class NestedIfExercises {
	public static void main(String[] args) {

//YOU ARE A LOAN SPECIALIST AND YOU NEED TO ASK USER WHAT IS THE AMOUNT OF LOAN IS NEEDED. 
// IF LOAN IS LESS THAN 200.000 THEN YOU WOULD LEND THE MONEY OTHERWISE YOU WOULD REJECT THE CLIENT

		int amount;
		Scanner loan = new Scanner(System.in);
		System.out.print("Please tell us that how much money you are needed: ");
		amount = loan.nextInt();

		if (amount < 200000) {
			System.out.println("Your credit application approved we will send the amount today to your account");
		} else {
			System.out.println("Your credit application is rejected we are sorry. Please try again later.");
		}
		System.out.println("-----------------------------------------------------------------");
		
//YOU ARE DMV REPRESENTATIVE AND YOU NEED TO ASK CUSTOMER THEIR AGE.
//IF THEY ARE 18 AND OLDER YOU WILL ISSUE A DRIVER LICENCE TO THEM, OTHERWISE YOU WILL OFFER TO GET A LEARNERS PERMIT.
		int age;
		Scanner AGE = new Scanner(System.in);
		System.out.print("Hey! tell me that how old are you: ");
		age = AGE.nextInt();

		if (age >= 18) {
			if (age >75) {
				System.out.println("you are old to get drivers licence");
			}else {
				System.out.println("your driver licence will come to your address in five days");
			}
			
		} else { 
			if (age > 16) {
				System.out.println("You can get a drivers learning permit");
			} else {
				System.out.println("you can not get a licence");
			} 
		}
		System.out.println("-----------------------------------------------------------------");
// WRITE A PROGRAM TO CHECK WORK ELIGIBILITY
// IF USER IS YOUNGER THAN 16 > NOT ALLOWED TO WORK
		// OTHER WISE > ALLOW WORK
// IF USER IS SMALLER THAN 64 > GO TO WORK
		// OTHERWISE >ENJOY YOUR LIFE
		
		int Age;
		Scanner Eligibility = new Scanner (System.in);
		System.out.print("Please enter your age: ");
		Age = Eligibility.nextInt();
			
		if (Age<16) {
			System.out.println("not allowed to work");
		}else {
			if (Age >64) {
				System.out.println("you are not eligible to work pleae go and rest");
			}else {
				System.out.println("You are eligible go work hard work");
			}
		}
		
		System.out.println("-----------------------------------------------------------------");
//DECLARE VARIABLE FOR GPA AND HAVING A DIPLOMA
//IF USER HAS A DIPLOMA >> CONGRAT! -->> IF GPA IS HIGHER THAN 3.5 HIRE PERSON 
// OTHERWISE DON'T HIRE THAT PERSON

		double gpa1;
		
		Scanner Dip = new Scanner(System.in);
		System.out.print("Please type your GPA: ");
		gpa1 = Dip.nextDouble();
		
		
		if (gpa1>=3.5) {
			if (gpa1 >= 3.75) {
				System.out.println(" We are hiring you!");
			}else {
				System.out.println("We can not hire you sorry!");
			}
		}else {
			System.out.println("we have better applicants sorry have a good day!");
		}
		System.out.println("-----------------------------------------------------------------");	
		
		double gpa = 3.6;
		double expectedGpa=3.7;
		boolean hasDiploma = true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please go get your degree");
		}
		
		System.out.println("-----------------------------------------------------------------");
		
/*Create a Java program and store variables to store mortgage rate and mortgage price. 
 * First, program should check if rate is higher than 4.5, user will not buy a house, otherwise user will consider buying. 
 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 */

		double mortgageRate, mortgagePrice;
		
		mortgageRate = 3.5;
		mortgagePrice = 150000;
		
		if (mortgageRate<4.5) {
			System.out.println("Customer will consider buying");
			if (mortgagePrice<200000) {
				System.out.println("Customer will pay cash");
			}else {
				System.out.println("Customer will take loan");
			}
		}else {
			System.out.println("Customer won't buy a house");
		}
		System.out.println("-----------------------------------------------------------------");
		
		
		
/*Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
		
		int Experience, AnnualSalary;
		Scanner Year = new Scanner (System.in);
		System.out.print("Please enter your years of experience: ");
		Experience = Year.nextInt();
		System.out.print("Please enter your annual salary: ");
		AnnualSalary = Year.nextInt();
		
		if (Experience>=5) {
			System.out.println("You are eligible for bonus");
			if (AnnualSalary > 50000) {
				System.out.println("Your bonus is $5000");
			}else {
				System.out.println("Your bonus is $3000");
			}
		}else {
			System.out.println("You are not eligible for bonus");
		}
			
		System.out.println("-----------------------------------------------------------------");
		
		int planeNum, Price;
		Scanner Number = new Scanner(System.in);
		System.out.print("Please tell us how many plane that you want to buy: ");
		planeNum = Number.nextInt();
		System.out.print("Please tell us what is your price request for each plane: ");
		Price = Number.nextInt();
		
		if (planeNum>55) {
			System.out.println("Company: we will gve you 2 more plane. ");
			if (Price>200) {
				System.out.println("Company: We don't want "+Price+" just give us 195 we are dumb!");
			}else {
				System.out.println("Company: but your price request is low we can not give you discount last price is 175.");
			}
		}else {
			System.out.println("Company: We will think about your offer. And we let you know.");
			if (planeNum>15) {
				System.out.println("Company: We cannot give you any discount.");
				if (Price<150) {
					System.out.println("Company: We can not sell our planes at this price.");
				}else {
					System.out.println("Company: But your offer accepted.");
				}
			}else {
				System.out.println("Company: There is a just one option to accept:");
				if (Price>300) {
					System.out.println("Company: OK we can sell you plane");
				}else {
					System.out.println("Company: your offer rejected.");
				}
			}
		}
		System.out.println("-----------------------------------------------------------------");
		/* Check if user has a credit card.
		 * Check what is the balance. If balance is more than $1000 --> pay off immediately
		 * else "you are good"
		 */
		
		boolean creditCard =true;
		int balance = 900;
		
		if (creditCard) {
			System.out.println("Let me check your balance:");
			if (balance >=1000) {
				System.out.println("You balance amount is more than $1000. Please pay off immediately.");
			}else {
				System.out.println("You are good.");
			}
		}else { 
			System.out.println("Do you want a credit card?");
		}
				
		
		
	}
}
