package com.problemsolving.hashing;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		System.out.println(new ValidSudoku().isValidSudoku(new String[] { "..4...63.", ".........", "5......9.",
				"...56....", "4.3.....1", "...7.....", "...5.....", ".........", "........." }));

	}

	public int isValidSudoku(final String[] A) {
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (A[i].charAt(j) != '.') {
					if (!set.add("R" + i + A[i].charAt(j)) || !set.add("C" + j + A[i].charAt(j))) {
						return 0;
					}
					if (!set.add("B" + (i+ (j / 3)) + A[i].charAt(j))) {
						return 0;
					}
				}
			}
		}
		return 1;
	}

}
