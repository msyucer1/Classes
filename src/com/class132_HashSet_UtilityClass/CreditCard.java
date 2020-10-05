package com.class132_HashSet_UtilityClass;

public abstract class CreditCard {
	public String creditCardName;

	public CreditCard(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public void openAccount() {
		System.out.println("Open " + creditCardName + " Credit Card ");
	}

	public abstract void interestRate();

	public abstract void annualFee();
}

//class visa extends CreditCard {
//
//	public visa(String creditCardName) {
//		super(creditCardName);
//	}
//
//	@Override
//	public void interestRate() {
//		System.out.println(creditCardName + " card has interest rate of 25%");
//	}
//
//	@Override
//	public void annualFee() {
//		System.out.println(creditCardName + " card has annual fee of $250");
//	}
//
//}

class mastercard extends CreditCard {

	public mastercard(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " card has interest rate of 20%");
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName + " card has No annual fee");
	}

}

class aexpress extends CreditCard {

	public aexpress(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " card has interest rate of 22%");
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName + " card has annual fee of $15	0");
	}
}
