package com.problemsolving;

public class SuperReducedString {

	public static void main(String[] args) {
		// System.out.println(isIdentical("bcbb".substring(2)));
		System.out.println(superReducedString("aaabccddd"));
	}

	static String superReducedString(String str) {

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				str = str.substring(0, i - 1) + str.substring(i + 1);
				i = 0;
			}
		}

		if (str.length() == 0)
			return "Empty String";
		else
			return str;

	}

}
