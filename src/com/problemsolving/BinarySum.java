package com.problemsolving;

public class BinarySum {

	public static void main(String[] args) {
		System.out.println(new BinarySum().addBinary("11", "111"));
	}

	public String addBinary(String A, String B) {

		String result = "";

		int s = 0;

		int i = A.length() - 1, j = B.length() - 1;

		while (i >= 0 || j >= 0 || s == 1) {

			s += ((i >= 0) ? A.charAt(i) - '0' : 0);
			s += ((j >= 0) ? B.charAt(j) - '0' : 0);

			result = (char) (s % 2 + '0') + result;

			s /= 2;

			i--;
			j--;
		}

		return result;
	}

	public int[] toBinary(long decimal) {
		int binary[] = new int[32];
		int index = 0;

		while (decimal > 0) {
			binary[index++] = (int) (decimal % 2);
			decimal = decimal / 2;
		}

		return binary;
	}

	public long toDecimal(long binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				long temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}
}
