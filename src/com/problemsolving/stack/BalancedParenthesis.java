package com.problemsolving.stack;

import java.util.*;

public class BalancedParenthesis {

    public static void main(String[] args) {
        System.out.println(new BalancedParenthesis().solve2("{([])}"));
        System.out.println(new BalancedParenthesis().solve2("(){"));
        System.out.println(new BalancedParenthesis().solve2("()[]"));
        System.out.println(new BalancedParenthesis().solve2("))))))))"));
        System.out.println(new BalancedParenthesis().solve2("(((((((("));

        System.out.println(-1 % 20);
    }

    public boolean solve(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (checkEnd(stack, c, '(', ')')) {
                stack.pop();
            } else if (checkEnd(stack, c, '{', '}')) {
                stack.pop();
            } else if (checkEnd(stack, c, '[', ']')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    boolean checkEnd(Stack<Character> stack, char c, char start, char end) {
        return !stack.isEmpty() && stack.peek() == start && c == end;
    }

    public int solve2(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray())
            if (!addAndValidateStackWithChar(stack, c))
                return 0;
        return stack.isEmpty() ? 1 : 0;
    }

    private boolean addAndValidateStackWithChar(Stack<Character> stack, char c) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
            return true;
        }
        return checkCounter(stack, c);
    }

    public boolean checkCounter(Stack<Character> stack, char c) {
        if (stack.isEmpty())
            return true;

        char counterChar = stack.peek();
        if (c == '(' && counterChar == ')') {
            stack.pop();
            return true;
        }

        if (c == '{' && counterChar == '}') {
            stack.pop();
            return true;
        }

        if (c == '[' && counterChar == ']') {
            stack.pop();
            return true;
        }
        return false;
    }

}
