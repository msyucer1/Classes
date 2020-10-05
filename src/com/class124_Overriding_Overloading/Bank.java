package com.class124_Overriding_Overloading;

public class Bank {
	public int chargeInterest() {
		return 0;
	}
}

class BankOfAmerica extends Bank {
	@Override 
	public int chargeInterest() {
		return 2;
	}
}

class BankPNC extends Bank {
	@Override
	public int chargeInterest() {
		return 3;
	}
}

class BankWellsFargo extends Bank {
	@Override // annotation -- dipnot;
	public int chargeInterest() {
		
		return 5;
	}
}

class BankCapitalOne extends Bank {
	public int chargeInterest() {
		return 7;
	}
}

