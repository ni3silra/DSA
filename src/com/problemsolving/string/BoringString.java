package com.problemsolving.string;

import java.util.Arrays;

public class BoringString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(String A) {
		StringBuffer oddBuffer = new StringBuffer(), evenBuffer = new StringBuffer();

		char[] chArray = A.toCharArray();

		for (char ch : chArray)
			if (ch % 2 == 0)
				evenBuffer.append(ch);
			else
				oddBuffer.append(ch);

		char[] odd = oddBuffer.toString().toCharArray();
		char[] even = evenBuffer.toString().toCharArray();

		Arrays.sort(odd);
		Arrays.sort(even);

		if (Math.abs(odd[odd.length - 1] - even[0]) != 1 || Math.abs(even[even.length - 1] - odd[0]) != 1)
			return 1;
		else
			return 0;
	}

}
