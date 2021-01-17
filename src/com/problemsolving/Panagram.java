package com.problemsolving;

public class Panagram {

	public static final String PANAGRAM = "pangram";
	public static final String NOT_PANAGRAM = "not pangram";

	public static String p1 = "We promptly judged antique ivory buckles for the next prize";

	public static void main(String[] args) {
		System.out.println(pangrams(p1));
	}

	static String pangrams(String s) {
		int[] allChar = new int[27];

		allChar[0] = 1;

		for (char c : s.toCharArray())
			if (c >= 65 && c <= 90)
				allChar[c - 64] = 1;
			else if (c >= 97 && c <= 122)
				allChar[c - 96] = 1;

		for (int i : allChar)
			if (i == 0)
				return NOT_PANAGRAM;

		return PANAGRAM;
	}

}
