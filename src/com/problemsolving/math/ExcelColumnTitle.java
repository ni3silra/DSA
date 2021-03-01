package com.problemsolving.math;

public class ExcelColumnTitle {

	public static void main(String[] args) {
		System.out.println(new ExcelColumnTitle().convertToTitle(28));
	}

	public String convertToTitle(int A) {
		StringBuffer buffer = new StringBuffer();
		while (A > 0) {
			if (A % 26 != 0)
				buffer.append((char) ((A % 26) + 64));
			else {
				buffer.append('Z');
				A -= 26;
			}
			A = A / 26;
		}
		return buffer.reverse().toString();
	}

}
