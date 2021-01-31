package com.problemsolving.string;

public class VowelIt {

	public String solve(String A) {
		StringBuffer buffer = new StringBuffer();

		for (char c : A.toCharArray())
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				buffer.append(c);

		return buffer.toString();
	}

	public static void main(String[] args) {
		VowelIt it = new VowelIt();
		System.out.println(it.solve("interviewBit"));
	}
}
