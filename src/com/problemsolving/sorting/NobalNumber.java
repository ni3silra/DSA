package com.problemsolving.sorting;

import java.util.Arrays;

public class NobalNumber {

	public static void main(String[] args) {
		System.out.println(new NobalNumber().isNobalPresent(new int[] { 1, 3, 2, 3 }));

	}

	public boolean isNobalPresent(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++)
			if (i == A.length - 1 || A[i] != A[i + 1])
				if (A[i] == A.length - i - 1)
					return true;
		return false;
	}

}
