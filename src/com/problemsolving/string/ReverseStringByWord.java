package com.problemsolving.string;

import java.util.Arrays;

public class ReverseStringByWord {

	public static void main(String[] args) {
		System.out.println(new ReverseStringByWord()
				.solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));

	}

	public String solve(String A) {

		String[] arr = A.split(" ");
		StringBuffer output = new StringBuffer();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals(""))
				continue;
			else
				output.append(arr[i].trim() + " ");
		}

		return output.toString().trim();

	}

}
