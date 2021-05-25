package com.problemsolving.string;

public class SearchingChallenge {

	public static final String TRUE = "true";
	public static final String FALSE = "false";

	public static String searchingChallenge(String A) {

		int length = A.length();
		if (length < 4 && length > 25)
			return FALSE;

		int firstChar = A.toCharArray()[0];
		if ((firstChar < 65 && firstChar > 90) || (firstChar < 97 && firstChar > 122))
			return FALSE;

		for (int ch : A.toCharArray()) {
			boolean check = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57) || ch == 95;
			if (!check)
				return FALSE;
		}

		int lastChar = A.toCharArray()[length - 1];
		if (lastChar == 95)
			return FALSE;

		return TRUE;
	}

}
