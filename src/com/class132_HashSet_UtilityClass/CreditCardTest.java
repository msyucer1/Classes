package com.class132_HashSet_UtilityClass;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
//		visa visaCard = new visa("Visa Platinium");
		aexpress ax = new aexpress("AX Rewards");
		mastercard mc = new mastercard("MC basic");
		
		ArrayList<CreditCard> alist = new ArrayList<CreditCard>();
//		alist.add(visaCard);
		alist.add(ax);
		alist.add(mc);
		
		for (CreditCard card : alist) {
			System.out.println(card.creditCardName);
			card.interestRate();
		}
		
		Iterator<CreditCard> myIterator = alist.iterator();
		while (myIterator.hasNext()) {
			myIterator.next().interestRate();
		}
		
		for (int i = 0; i<alist.size(); i++) {
			alist.get(i).annualFee();
		}
	}
}
