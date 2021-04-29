package com.problemsolving.stack;

import java.util.*;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] nextGreater(int[] A) {

		int[] ans = new int[A.length];
		Stack<Integer> stack = new Stack<>();
		int n = A.length;
		int next, i, j;
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (A[i] < A[j]) {
					next = A[j];
					break;
				}
			}
			// System.out.println(A[i] + " -- " + next);
			ans[i] = next;
		}
		return ans;
	}

}
