package com.problemsolving;

import java.util.Scanner;

public class Anagrams {

	static int makeAnagram(String a, String b) {

		int[] alphabets = new int[26];

		int diff = 0;

		for (char c : a.toCharArray())
			alphabets[c - 97]++;

		for (char c : b.toCharArray())
			alphabets[c - 97]--;

		for (int i : alphabets)
			if (i != 0)
				diff++;

		return diff;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String a = scanner.nextLine();
		String b = scanner.nextLine();

		int res = makeAnagram(a, b);
		System.out.println(String.valueOf(res));

		scanner.close();
	}
}
