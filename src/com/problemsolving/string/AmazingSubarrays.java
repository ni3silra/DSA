package com.problemsolving.string;

/*
 * You are given a string S, and you have to find all the amazing substrings of S.

Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 * */

public class AmazingSubarrays {

	public static void main(String[] args) {
		System.out.println(new AmazingSubarrays().solve(
				"pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn"));

	}

	public int solve(String A) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		char[] arr = A.toCharArray();
		int length = arr.length;
		int count = 0;

		for (int i = 0; i < length; i++)
			for (char c : vowels)
				if (arr[i] == c)
					count += length - i;

		return count % 10003;
	}

}
