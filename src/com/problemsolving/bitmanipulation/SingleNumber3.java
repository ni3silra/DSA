package com.problemsolving.bitmanipulation;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solve(int[] A) {
		int[] ans = new int[2];

		int xor = 0;
		for (int i : A)
			xor = xor ^ i;
		
		int a = 0, b = 0;
		int mask = (xor & (xor - 1)) ^ xor;

		for (int i : A)
			if ((i & mask) == 1)
				a = a ^ i;
			else
				b = b ^ i;

		ans[0] = Math.min(a, b);
		ans[1] = Math.max(a, b);
		return ans;
	}

}
