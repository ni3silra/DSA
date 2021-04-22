package com.problemsolving.twopointer;

import java.util.HashSet;

public class PairswithGivenDifference {

	public static void main(String[] args) {
		System.out.println(new PairswithGivenDifference().solve(new int[] { 1, 5, 3, 4, 2 }, 3));
		System.out.println(new PairswithGivenDifference().solve(new int[] { 8, 12, 16, 4, 0, 20 }, 4));
		System.out.println(new PairswithGivenDifference().solve(new int[] { 1, 1, 1, 2, 2 }, 0));
		System.out.println(new PairswithGivenDifference().solve(new int[] { 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2,
				2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3 }, 3));
	}

	public int solve(int[] A, int B) {
		int count = 0;
		HashSet<Pair> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (set.add(new Pair(A[i], A[j])) && Math.abs(A[i] - A[j]) == B) {
					count++;
				}
			}
		}
		return count;
	}

}

class Pair implements Comparable<Pair> {
	int f;
	int s;

	Pair(int f, int s) {
		this.f = f;
		this.s = s;
	}

	@Override
	public int compareTo(Pair o) {
		return o.hashCode() - this.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return ((Pair) obj).hashCode() == this.hashCode();
	}

}
