package com.problemsolving.bitmanipulation;

public class StrangeEquality {

	public static void main(String[] args) {
		System.out.println(new StrangeEquality().solve2(5));
		System.out.println(new StrangeEquality().solve2(2));
	}

	// brute force
	public int solve(int A) {
		int n = A;
		int low = 0;
		int high = 0;

		for (int i = n - 1; i >= 1; i--) {
			if ((i ^ n) == (i + n)) {
				low = i;
				break;
			}
		}

		for (int i = n + 1; i <= n * n; i++) {
			if ((i ^ n) == (i + n)) {
				high = i;
				break;
			}
		}

		return low ^ high;
	}

	// optimized
	// A+B = (A^B) + 2*(A&B)

	public int solve2(int A) {
		String binary = Integer.toBinaryString(A);
		StringBuffer low = new StringBuffer();
		StringBuffer high = new StringBuffer();

		for (char c : binary.toCharArray()) {
			if (c == '0')
				low.append('1');
			else
				low.append('0');
			high.append('0');
		}
		high.append('1');

		int a = Integer.parseInt(high.reverse().toString(), 2);
		int b = Integer.parseInt(low.toString(), 2);

		return a ^ b;
	}

}
