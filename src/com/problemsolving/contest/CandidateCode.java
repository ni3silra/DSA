package com.problemsolving.contest;
/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/


import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		int n = Integer.parseInt(scanner.next());

		String[] arrayB = new String[n];

		for (int i = 0; i < n; i++)
			arrayB[i] = scanner.next();
		for (String ans : checkVirus(A, arrayB))
			System.out.println(ans);
	}

	public static String[] checkVirus(String A, String[] B) {
		String[] ans = new String[B.length];
		for (int i = 0; i < B.length; i++)
			ans[i] = isSubSequence(A, B[i], A.length(), B[i].length()) ? "POSITIVE" : "NEGATIVE";
		return ans;
	}

	static boolean isSubSequence(String A, String B, int m, int n) {
		int j = 0;
		for (int i = 0; i < n && j < m; i++)
			if (A.charAt(j) == B.charAt(i))
				j++;
		return (j == m);
	}

}
