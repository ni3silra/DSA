package com.problemsolving.stack;

import java.util.*;

public class BalancedParanthesis {

    public static void main(String[] args) {
        System.out.println(new BalancedParanthesis().solve("{([])}"));
        System.out.println(new BalancedParanthesis().solve("(){"));
        System.out.println(new BalancedParanthesis().solve("()[]"));
        System.out.println(new BalancedParanthesis().solve("))))))))"));
        System.out.println(new BalancedParanthesis().solve("(((((((("));
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
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    boolean checkEnd(Stack<Character> stack, char c, char start, char end) {
        return !stack.isEmpty() && stack.peek() == start && c == end;
    }

}
