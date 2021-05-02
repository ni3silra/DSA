package com.algorithms.searching;

import java.util.*;

public class ZAlgorithm {

	public static void main(String[] args) {
		String text = "aaabcxyzaaaabczaaczabbaaaaaabc";
		String pattern = "aaabc";
		ZAlgorithm zAlgorithm = new ZAlgorithm();
		List<Integer> result = zAlgorithm.matchPattern(text.toCharArray(), pattern.toCharArray());
		result.forEach(System.out::println);
	}

	public List<Integer> matchPattern(char[] text, char[] pattern) {
		char[] newString = new char[text.length + pattern.length + 1];
		List<Integer> result = new ArrayList<>();
		int i = 0;

		for (char ch : pattern)
			newString[i++] = ch;

		newString[i++] = '$';

		for (char ch : text)
			newString[i++] = ch;

		int[] zarray = calculateZ(newString);

		for (i = 0; i < zarray.length; i++)
			if (zarray[i] == pattern.length)
				result.add(i - pattern.length - 1);
		return result;
	}

	private int[] calculateZ(char[] input) {
		int Z[] = new int[input.length];
		int left = 0;
		int right = 0;
		for (int k = 1; k < input.length; k++) {
			if (k > right) {
				left = right = k;
				while (right < input.length && input[right] == input[right - left]) {
					right++;
				}
				Z[k] = right - left;
				right--;
			} else {
				// we are operating inside box
				int k1 = k - left;
				// if value does not stretches till right bound then just copy it.
				if (Z[k1] < right - k + 1) {
					Z[k] = Z[k1];
				} else { // otherwise try to see if there are more matches.
					left = k;
					while (right < input.length && input[right] == input[right - left]) {
						right++;
					}
					Z[k] = right - left;
					right--;
				}
			}
		}
		return Z;
	}

}
