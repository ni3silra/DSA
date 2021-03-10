package com.problemsolving.custom;

import java.util.*;

public class SortTheUnsortedArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();

		for (int i : new int[] { -355071087, -679308132, 398052175, 755454983, 814022370, 889267058 }) {
			A.add(i);
		}
		System.out.println(new SortTheUnsortedArray().solve(A));
	}

	public int solve(ArrayList<Integer> A) {
		ArrayList<Integer> copyA = new ArrayList<>();

		for (int i : A)
			copyA.add(i);

		Collections.sort(A);

		int l = 0;
		int r = 0;

		for (int i = 0; i < A.size(); i++) {
			if (!A.get(i).equals(copyA.get(i))) {
				l = i;
				break;
			}
		}

		for (int i = A.size() - 1; i >= 0; i--) {
			if (!A.get(i).equals(copyA.get(i))) {
				r = i;
				break;
			}
		}
		if (l == r)
			return 0;

		return r - l + 1;

	}

}
