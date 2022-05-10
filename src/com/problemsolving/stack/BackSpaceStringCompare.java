package com.problemsolving.stack;

import java.util.Stack;

public class BackSpaceStringCompare {

    public static void main(String[] args) {
        System.out.println(new BackSpaceStringCompare().backspaceCompare("abcd", "bbcd"));
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = getStack(s);
        Stack<Character> tStack = getStack(t);

        if (sStack.size() != tStack.size())
            return false;

        int size = sStack.size();

        for (int i = 0; i < size; i++)
            if (sStack.pop() != tStack.pop())
                return false;
        return true;
    }

    private Stack<Character> getStack(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray())
            if (c != '#')
                stack.push(c);
            else if (!stack.isEmpty())
                stack.pop();
        return stack;
    }
}
