package com.problemsolving.stack;

import java.util.*;

public class RedundantBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int braces(String A) {
		char open = '(';
		char close = ')';
		HashSet<Character> arith = new HashSet<>();

		arith.addAll(new ArrayList<Character>(Arrays.asList('+', '-', '*', '/')));

		Stack<Character> stack = new Stack<>();

		for (char c : A.toCharArray()) {
			if (c == open) {
				stack.push(c);
			} else if (stack.peek().equals(c)) {
				stack.pop();
			} else if (arith.contains(c)) {
				stack.push(c);
			}
		}

		return 1;

	}

}
