package com.problemsolving.string;

import java.util.*;

public class MakeStringPallindrome {

	public static void main(String[] args) {
		System.out.println(new MakeStringPallindrome().solve("abc"));
		System.out.println(new MakeStringPallindrome().solve("bbcc"));
	}

	public int solve(String A) {
		StringBuilder s = new StringBuilder();
		s.append(A);
		String rev = s.reverse().toString();
		s.reverse().append("$").append(rev);
		int lps[] = computeLPSArray(s.toString());
		return A.length() - lps[s.length() - 1];
	}

	public int[] computeLPSArray(String str) {
		int n = str.length();
		int lps[] = new int[n];
		int i = 1, len = 0;
		lps[0] = 0;
		while (i < n) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	Integer dp[][];

	int find(int l, int r, char arr[]) {
		if (dp[l][r] != null)
			return dp[l][r];
		if (l >= r)
			return 0;
		if (arr[l] == arr[r])
			return dp[l][r] = find(l + 1, r - 1, arr);
		return dp[l][r] = 1 + Math.min(find(l + 1, r, arr), find(l, r - 1, arr));
	}

	public int solve_DP(String A) {
		dp = new Integer[A.length()][A.length()];
		return find(0, A.length() - 1, A.toCharArray());
	}

//	public int solve(String A) {
//		if (isPalindrome(A))
//			return 0;
//		A = A.substring(1);
//		return 1 + solve(A);
//	}

	public int solve2(String A) {
		int count = 0;

		if (isPalindrome(A))
			return count;

		for (int i = A.length() - 1; i >= 0; i--) {
			count++;

			if (isPalindrome(A.substring(0, i)))
				break;
		}
		return count;
	}

	public boolean isPalindrome(String A) {

		char[] array = A.toCharArray();

		int l = 0;
		int r = array.length - 1;

		while (l < r)
			if (array[l++] != array[r--])
				return false;

		return true;
	}
}
