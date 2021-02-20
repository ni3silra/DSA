package com.problemsolving.hashing;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		System.out.println(new ContiguousArray().solve(new int[] { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1 }));
	}

	public int solve(int[] A) {
		int sum = 0;
		int maxsize = -1;
		int n = A.length;

		for (int i = 0; i < n - 1; i++) {
			sum = (A[i] == 0) ? -1 : 1;
			for (int j = i + 1; j < n; j++) {
				if (A[j] == 0)
					sum += -1;
				else
					sum += 1;

				if (sum == 0 && maxsize < j - i + 1)
					maxsize = j - i + 1;
			}
		}

		return maxsize;
	}

}
