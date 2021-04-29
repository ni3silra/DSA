package com.problemsolving.stack;

import java.util.*;

public class EvaluateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int evalRPN(ArrayList<String> A) {

		int ans = 0;
		
		HashSet<String> set = new HashSet<>();
		set.add("+");
		set.add("-");
		set.add("//");
		set.add("*");
		
		Stack<Integer> stack = new Stack<>();

		for (String s : A) {
			if (set.contains(s)) {
				int num1 = stack.pop();
				int num2 = stack.pop();

				if (num1 < num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}

				if (s.equals("+"))
					ans = num1 + num2;
				else if (s.equals("-"))
					ans = num1 + num2;
				else if (s.equals("*"))
					ans = num1 + num2;
				else if (s.equals("//"))
					ans = num1 / num2;

				stack.push(ans);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}

		return ans;
	}

}
