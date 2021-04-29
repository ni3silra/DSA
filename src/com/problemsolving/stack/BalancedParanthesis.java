package com.problemsolving.stack;

import java.util.*;

public class BalancedParanthesis {

	public static void main(String[] args) {
		System.out.println(new BalancedParanthesis().solve("{([])}"));
		System.out.println(new BalancedParanthesis().solve("(){"));
		System.out.println(new BalancedParanthesis().solve("()[]"));
		System.out.println(new BalancedParanthesis().solve("))))))))"));
	}

	// “{“,”}”, ”(“,”)”, ”[“,”]”
	public int solve(String A) {

		// pre processing

		HashSet<Character> open = new HashSet<>();
		open.add('{');
		open.add('(');
		open.add('[');
		HashSet<Character> close = new HashSet<>();
		close.add('}');
		close.add(')');
		close.add(']');

		Stack<Character> s = new Stack<>();

		for (char c : A.toCharArray())
			if (open.contains(c))
				s.push(c);
			else if (s.isEmpty())
				return 0;
			else if (close.contains(c))
				s.pop();

		return s.size() == 0 ? 1 : 0;
	}

}
