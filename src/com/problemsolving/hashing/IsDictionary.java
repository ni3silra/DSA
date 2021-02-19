package com.problemsolving.hashing;

import java.util.ArrayList;
import java.util.List;

public class IsDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(String[] A, String B) {

		for (int i = 1; i < A.length; i++) {
			char[] word1array = A[i - 1].toCharArray(), word2array = A[i].toCharArray();
			int w1 = 0, w2 = 0;
			while (w1 < word1array.length || w2 < word2array.length) {
				try {
					if (B.indexOf(word1array[w1]) > B.indexOf(word2array[w2]))
						return 0;
					else if (B.indexOf(word1array[w1]) < B.indexOf(word2array[w2])) {
						break;
					} else if (B.indexOf(word1array[w1]) == B.indexOf(word2array[w2])) {
						w1++;
						w2++;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (w1 == word1array.length)
						break;
					else
						return 0;
				}
			}
		}
		return 1;
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
