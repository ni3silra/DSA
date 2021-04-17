package com.problemsolving.sorting;

import java.util.*;

public class ReversePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(int[] A) {
		int n = A.length;
		int count = 0;
		
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (A[i] > 2 * A[j])
					count++;

		return count;
	}

}
