package com.problemsolving.string;

public class ClosestPalindrome {

	public static void main(String[] args) {
		System.out.println(new ClosestPalindrome().solve("NAAN"));
	}

	public String solve(String A) {
		int i = 0;
		int j = A.length() - 1;
		int changeCount = 0;
		char[] arr = A.toCharArray();
		String ans = null;
		while (i < j) {

			if (arr[i] != arr[j])
				changeCount++;

			if (changeCount > 1) {
				ans = "NO";
				break;
			}
			i++;
			j--;
		}

		if (ans == null)
			ans = (changeCount == 1) || (changeCount == 0 && (A.length() % 2 != 0)) ? "YES" : "NO";

		return ans;
	}
}
