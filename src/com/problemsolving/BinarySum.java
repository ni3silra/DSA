package com.problemsolving;

public class BinarySum {

	public static void main(String[] args) {
		System.out.println(new BinarySum().addBinary("11", "111"));
	}

	public String addBinary(String A, String B) {
		StringBuffer sb = new StringBuffer();

		for (int i : toBinary(toDecimal(Long.parseLong(A)) + toDecimal(Long.parseLong(B))))
			sb.append(i);

		return sb.toString();
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
