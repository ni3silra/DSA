/*
 * Little Ponny and Maximum Element
 * Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
 * He wants your help for finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible then return -1.
 */
package com.problemsolving;

public class MaxElement {

	public static void main(String[] args) {
		int array[] = { 1, 4, 2 };
		System.out.println(new MaxElement().solve(array, 3));
	}

	public int solve(int[] A, int B) {
		int maxUp = 0;

		for (int i : A)
			if (i > B)
				maxUp++;
		
		for (int i : A)
			if (i == B)
				return maxUp;

		return -1;
	}

}
