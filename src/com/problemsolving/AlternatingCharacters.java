package com.problemsolving;

public class AlternatingCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		// To do
		String newStringY = s.replace("AB", "Y");
		String newStringZ = s.replace("BA", "Z");

		int countY = 0;
		int countZ = 0;

		for (char c : newStringY.toCharArray())
			if (c == 'Y')
				countY++;

		for (char c : newStringZ.toCharArray())
			if (c == 'Z')
				countZ++;

		if (countY == 0 && countZ == 0)
			return s.length() - 1;
		else if (countY < countZ)
			return newStringZ.length() - countZ;
		else if (countY == countZ)
			return newStringZ.length() - countZ - 1;
		else
			return newStringY.length() - countY;

	}

	public static void main(String[] args) {

		int result = alternatingCharacters("BBBBB");
		System.out.println(String.valueOf(result));
	}
}
