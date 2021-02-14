package com.problemsolving.bitmanipulation;

import java.util.ArrayList;
import java.util.HashSet;

public class PairsWithGivenXor {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : new int[] { 5, 4, 10, 15, 7, 6 }) {
			A.add(i);
		}
		System.out.println(new PairsWithGivenXor().solve(A, 5));
	}

	public int solve(ArrayList<Integer> A, int B) {

		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int a : A) {
			set.add(a);
			if (set.contains((B ^ a)))
				count++;
		}
		return count;
	}
}
