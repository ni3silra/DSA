package com.problemsolving.bitmanipulation;

public class SmallestGoodBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solve(String A) {
		Long a = Long.parseLong(A);
		long x = 1;
		long res = 0;
		for (long i = 62; i >= 2; i--) {
			if ((x << i) < a) {
				res = computeGoodBase(a, i);
				if (res != -1)
					return new Long(res).toString();
			}
		}
		return new Long(a - 1).toString();
	}

	public long computeGoodBase(Long a, Long bits) {
		Long as = (long) Math.pow(a - 1, 1.0 / bits);

		long sum = 1;
		long currSum = 1;
		for (long i = 1; i <= bits; i++) {
			currSum *= as;
			sum += currSum;
		}
		if (sum == a)
			return as;
		return -1;
	}

}
