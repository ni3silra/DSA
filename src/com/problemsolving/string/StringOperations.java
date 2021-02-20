package com.problemsolving.string;

/*
 * Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
 */

public class StringOperations {

	public static void main(String[] args) {
		System.out.println(new StringOperations().solve("AbcaZeoB"));

	}

	public String solve(String A) {

		String vowels = "aeiou";

		StringBuffer buffer = new StringBuffer();

		for (char c : A.toCharArray()) {
			if (c >= 'A' && c <= 'Z')
				continue;
			else if (vowels.contains(c + ""))
				buffer.append("#");
			else
				buffer.append(c);
		}

		return buffer.toString() + buffer.toString();
	}

}
