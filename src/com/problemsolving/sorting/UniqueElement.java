package com.problemsolving.sorting;

import java.util.*;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<Integer> A) {

		Collections.sort(A);

		int previousSum = 0;
		for (int i : A)
			previousSum += i;

		int newSum = A.get(0);

		for (int i = 1; i < A.size(); i++) {
			if (A.get(i) == A.get(i - 1)) {
				int j = i;
				while (j < A.size() && A.get(j) <= A.get(j - 1)) {
					A.set(j, A.get(j) + 1);
					j++;
				}
			}
			newSum = newSum + A.get(i);
		}

		return newSum - previousSum;
	}

}
