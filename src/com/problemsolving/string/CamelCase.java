package com.problemsolving.string;

public class CamelCase {

	public static void main(String[] args) {
		System.out.println(camelCase("camelCase"));
	}

	static int camelCase(String s) {
		int count = 1;

		for (char c : s.toCharArray())
			if (c >= 65 && c <= 90)
				count++;

		return count;
	}

}
