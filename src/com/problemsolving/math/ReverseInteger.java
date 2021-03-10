package com.problemsolving.math;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(-1146467285));
	}// 2147483648

	public int reverse(int A) {

		boolean sign = A < 0 ? true : false;

		if (sign)
			A = A * (-1);

		int revA = reverseNum(A);
		// System.out.println(revA + " " + reverseNum(revA));
		// revA = reverseNum(revA) == A ? revA : 0;

		if (sign)
			revA = (-1) * revA;

		return revA;

	}

	int reverseNum(int A) {
		int Number = 0;
		System.out.println(Integer.MAX_VALUE);
		while (A > 0) {
			System.out.println(Number);
			if (Number >= Integer.MAX_VALUE / 10 && A % 10 > 7 && Number > 1000000000) {
				return 0;
			}

			Number += A % 10;

			A /= 10;

			if (A > 0)
				Number *= 10;
		}

		return Number;
	}

	public int reverse2(int A) {

		int reverse = 0;
		try {
			while (A != 0) {
				int rem = A % 10;
				reverse = Math.addExact(reverse * 10, rem);
				A /= 10;
			}
		} catch (ArithmeticException e) {
			return 0;
		}
		return reverse;
	}
}