package com.problemsolving.string;

public class StrongPassword {

	public static final String numbers = "0123456789";
	public static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
	public static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String special_characters = "!@#$%^&*()-+";

	public static void main(String[] args) {
		System.out.println(minimumNumber(4, "06HL"));
	}

	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int sumNum = 0;
		int sumlc = 0;
		int sumuc = 0;
		int sumsc = 0;

		int newout = 0;

		if (password.length() < 6)
			newout = 6 - password.length();

		for (char c : password.toCharArray()) {

			if (sumNum != 0 && sumlc != 0 && sumuc != 0 && sumsc != 0)
				break;

			if (sumNum == 0)
				for (char num : numbers.toCharArray())
					if (c == num) {
						sumNum++;
						break;
					}

			if (sumlc == 0)
				for (char lc : lower_case.toCharArray())
					if (c == lc) {
						sumlc++;
						break;
					}

			if (sumuc == 0)
				for (char uc : upper_case.toCharArray())
					if (c == uc) {
						sumuc++;
						break;
					}

			if (sumsc == 0)
				for (char sc : special_characters.toCharArray())
					if (c == sc) {
						sumsc++;
						break;
					}

		}

		int out = 0;

		if (sumNum == 0)
			out++;
		if (sumlc == 0)
			out++;
		if (sumuc == 0)
			out++;
		if (sumsc == 0)
			out++;
		return newout > out ? newout : out;
	}

}
