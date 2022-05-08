package com.problemsolving.linkedlist;


import java.util.Stack;

public class PalindromeList {

    public static void main(String[] args) {
        lPalin(null);
    }

    public static int lPalin(ListNode A) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = A;

        while (temp != null) {
            stack.add(temp.val);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != A.val)
                return 0;
            A = A.next;
        }
        return 1;
    }

  }
