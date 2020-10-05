package com.class136_Exceptions_Throw;

public class TaskThrow {
	
//	create an exception when user is trying to withdraw larger amount that the balance
//	throw an exception saying "You don't have enough money"

	static int balance = 15000;
	
	public static void main(String[] args) {
		withdraw(17000);
	}
	
	public static void withdraw(int num) {
		if (num < balance) {
			System.out.println("Your new balance is "+(balance-num));
		}else {
			throw new ArithmeticException("You do not have enough money to withdraw");
		}
	}
}
