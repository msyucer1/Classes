package com.class126_Super_This;

public class BankTest {

	public static void main(String[] args) {
		
		Bank amount;
		
		amount = new Bank();
		System.out.println("You have $"+ amount.getBalance()+" in this Bank");
		
		amount = new BankA();
		System.out.println("You have $"+ amount.getBalance()+" in this Bank");
		
		amount = new BankB();
		System.out.println("You have $"+ amount.getBalance()+" in this Bank");
		
		amount = new BankC();
		System.out.println("You have $"+ amount.getBalance()+" in this Bank");
		
	}
}
