package com.problemsolving.string;

import java.util.Arrays;

public class LexicographicallyLargest {

	public static void main(String[] args) {
		System.out.println(new LexicographicallyLargest().getLargest("ittmcsvmoa_jktvvblefw"));

	}

	public String getLargest(String A) {

		String[] sArr = A.split("_");
		char[] input = sArr[0].toCharArray();
		char[] changeChar = sArr[1].toCharArray();
		 Arrays.sort(changeChar);
		int j = changeChar.length - 1;
		for (int i = 0; i < input.length; i++) {
			if (j >= 0) {
				if (input[i] < changeChar[j]) {
					input[i] = changeChar[j];
					changeChar[j] = '\0';
					j--;
				}
			} else {
				break;
			}

		}

		return new String(input);
	}

}
