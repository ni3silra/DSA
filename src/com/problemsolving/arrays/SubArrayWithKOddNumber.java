package com.problemsolving.arrays;

import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;

public class SubArrayWithKOddNumber {

	public static void main(String[] args) {
		
		System.out.println(Arrays
				.toString(new SubArrayWithKOddNumber()
						.solve(new int[] { 2, 1, 4, 9, 5, 7, 2 }, 3)));
		System.out.println(Arrays
				.toString(new SubArrayWithKOddNumber()
						.solve(new int[] { 7, 2, 3, 9, 7, 2, 6, 5, 4, 1, 9, 7 }, 4)));
		
	}

	public int[] solve(int[] A, int B) {
		int startIndex = -1;
		int endIndex = -1;
//		int countOdd = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int lastIndex = Integer.MAX_VALUE;
		int minLength = 0;
		map.put(0, -1);
		int currentSum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0)
				currentSum += A[i];
			if (map.get(currentSum - B) != null) {
				minLength = map.get(currentSum - B);
				if (i - lastIndex < minLength) {
					minLength = i - lastIndex;
					startIndex = minLength + 1;
					endIndex = i;
				}
			}
		}

//		for (int i = 0; i < A.length; i++) {
//			
//			if (A[i] % 2 != 0) {
//				countOdd++;
//				if (startIndex == -1) {
//					startIndex = i;
//				} else if (countOdd == B) {
//					endIndex = i;
//					if (endIndex - startIndex < subArraySize)
//						subArraySize = endIndex - startIndex;
//				}
//
//			}
//		}

		return new int[] { startIndex, endIndex };
	}

}
