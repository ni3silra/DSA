package com.problemsolving.hashing;

import java.util.ArrayList;
import java.util.List;

public class IsDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<String> A, String B) {

		List<StringChar> list = new ArrayList<>();

		String previousString = A.get(0);

		for (int i = 1; i < A.size(); i++) {
			String latestString = A.get(i);
			if (previousString.charAt(0) != latestString.charAt(0)) {
				list.add(new StringChar(previousString.charAt(0)));
			}
			previousString = latestString;
		}

		return 0;
	}

}

class StringChar {
	char initalChar;
	StringChar afterchar;

	public StringChar(char initalChar) {
		this.initalChar = initalChar;
		afterchar.setAfterchar(null);
	}

	public char getInitalChar() {
		return initalChar;
	}

	public void setInitalChar(char initalChar) {
		this.initalChar = initalChar;
	}

	public StringChar getAfterchar() {
		return afterchar;
	}

	public void setAfterchar(StringChar afterchar) {
		this.afterchar = afterchar;
	}

}
