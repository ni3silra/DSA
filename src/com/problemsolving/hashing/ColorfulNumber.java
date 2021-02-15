package com.problemsolving.hashing;

import java.util.HashSet;

/*
 * 
 * For Given Number A find if its COLORFUL number or not.

If number A is a COLORFUL number return 1 else return 0.

What is a COLORFUL Number:

A number can be broken into different contiguous sub-subsequence parts. 
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.
 * 
 * */

public class ColorfulNumber {

	public static void main(String[] args) {
		System.out.println(new ColorfulNumber().colorful(236));
	}

	public int colorful(int A) {

		String stringA = String.valueOf(A);

		if (stringA.length() == 1)
			return 1;

		if (stringA.contains("1") || stringA.contains("0"))
			return 0;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < stringA.length(); i++) {
			int multiply = 1;
			for (int j = i; j < stringA.length(); j++) {
				multiply *= stringA.charAt(j) - '0';
				if (set.contains(multiply))
					return 0;
				set.add(multiply);
			}
		}

		return 1;
	}

}
