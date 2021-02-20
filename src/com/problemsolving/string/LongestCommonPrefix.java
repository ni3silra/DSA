package com.problemsolving.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(
				new LongestCommonPrefix().longestCommonPrefix(new String[] { "abab", "ab", "abcd" }));
	}

	public String longestCommonPrefix(String[] A) {
		StringBuffer buffer = new StringBuffer();

		Arrays.sort(A, (str1, str2) -> str1.length() - str2.length());

		char[] check = A[0].toCharArray();

		for (int i = 0; i < check.length; i++) {
			boolean chk = true;
			for (String s : A) {
				if (s.indexOf(check[i]) == -1) {
					chk = false;
				}
			}

			if (chk) {
				buffer.append(check[i]);
			} else {
				break;
			}
		}

		return buffer.toString();
	}

}
