package com.problemsolving.math;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(-1146467285));
	}// 2147483648

	public int reverse(int A) {
		boolean sign = A < 0;
		if (sign)  A *=-1;
		int revA = reverseNum(A);
		if (sign) revA *=-1;
		return revA;
	}

	int reverseNum(int A) {
		long n = 0;
		while (A > 0) {
			n += A % 10;
			A /= 10;
			n *= 10;
		}
		return (int) n;
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