/*

Given an integer array A of size N.
Find the minimum number of elements that need to be removed such that the GCD of the resulting array becomes 1.

If not possible then return -1.

*/

package com.problemsolving.math;

import java.util.ArrayList;

public class DeleteElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<Integer> A) {
		int currGcd = A.get(0);
		for (int i : A) {
			currGcd = gcd(i, currGcd);
		}
		if (currGcd == 1)
			return 0;
		return -1;
	}

	public int gcd(int A, int B) {
		if (B == 0)
			return A;
		return gcd(B, A % B);
	}

}
