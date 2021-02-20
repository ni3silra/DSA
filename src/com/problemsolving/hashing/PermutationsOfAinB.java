package com.problemsolving.hashing;

public class PermutationsOfAinB {

	static final int MAX = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	static boolean compare(char arr1[], char arr2[]) {
		for (int i = 0; i < MAX; i++)
			if (arr1[i] != arr2[i])
				return false;
		return true;
	}

	static int solve(String A, String B) {
		int M = B.length();
		int N = A.length();
		int count = 0;
		char[] countP = new char[MAX];
		char[] countTW = new char[MAX];

		for (int i = 0; i < M; i++) {
			(countP[B.charAt(i)])++;
			(countTW[A.charAt(i)])++;
		}

		for (int i = M; i < N; i++) {
			if (compare(countP, countTW))
				count++;
			(countTW[A.charAt(i)])++;
			countTW[A.charAt(i - M)]--;
		}

		if (compare(countP, countTW))
			count++;
		return count;
	}

}
