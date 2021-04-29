package com.problemsolving.stack;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> helperStack = new Stack<>();

	public void push(int x) {
		stack.push(x);
		if (helperStack.isEmpty()) {
			helperStack.push(x);
		} else if (x <= (int) helperStack.peek()) {
			helperStack.push(x);
		}
	}

	public void pop() {

		if (stack.isEmpty())
			return;

		if (stack.peek().equals(helperStack.peek()))
			helperStack.pop();
		stack.pop();

	}

	public int top() {
		if (stack.isEmpty())
			return -1;

		return stack.peek();
	}

	public int getMin() {
		if (helperStack.isEmpty())
			return -1;
		return helperStack.peek();
	}

}
