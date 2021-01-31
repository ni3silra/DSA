package com.problemsolving.string;

public class SherlockAndTheValidString {

	public static final String Y = "YES";
	public static final String N = "NO";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String isValid(String s) {
		int[] allChar = new int[26];
		int sum = 0;
		for (char c : s.toCharArray())
			if (c >= 97 && c <= 122)
				allChar[c - 97] += 1;

		for (int i : allChar)
			if (sum == 0)
				sum = i;
			else if (i != 0)
				if (sum == i || sum - 1 == i || sum + 1 == i)
					continue;
				else
					return N;

		return Y;
	}
}
