package com.classReview6;

public class StringsReview {

	/**
	 * Create a class called StringsReview in it Write a program to concatenate or
	 * append ‘def’ to string ‘abc’ using StringBuffer and string ‘ghi’ to the
	 * concatenated string ‘abcdef’ using String builder.
	 */
	public static void main(String[] args) {

		String str = "abc";

		StringBuffer sb = new StringBuffer(str);
		sb.append("def");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder(sb);

		sb1.append("ghi");
		System.out.println(sb1);

	}
}
