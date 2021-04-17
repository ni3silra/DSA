package com.problemsolving.sorting;

import java.util.*;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(int[] A) {
		int steps = 0, i = 0, j = 0;
		Arrays.sort(A);
		while (j < A.length) {
			if (i >= A[j]) {
				steps += (i - A[j++]);
				i++;
			} else {
				i = A[j] + 1;
				j++;
			}
		}
		return steps;
	}

	public int solve2(int[] A) {
		int temp[] = new int[100001];
		for (int i = 0; i < A.length; i++) {
			temp[A[i]]++;
		}
		int taken = 0, ans = 0;
		for (int i = 0; i < 100001; i++) {
			if (temp[i] >= 2) {
				taken += (temp[i] - 1);
				ans -= (i * (temp[i] - 1));
			} else if (taken > 0 && temp[i] == 0) {
				taken--;
				ans += i;
			}
		}
		return ans;
	}

}
