package com.problemsolving.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        ListNode node = ListNode.getListNodeFromArray(array);
        System.out.println(reverseBySwap(node));
    }

    public static ListNode reverseByStack(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.add(ListNode.createListNode(head.val));
            head = head.next;
        }
        ListNode reverse = new ListNode();
        ListNode temp = reverse;
        while (!stack.isEmpty()) {
            reverse.next = stack.pop();
            reverse = reverse.next;
        }
        return temp.getNext();
    }

    public static ListNode reverseBySwap(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            pre = head.next;
            head = head.next;
            head.next.next = head;
        }
        return pre;
    }

    public static ListNode reverseByRecursion(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode newHead = reverseByRecursion(head.next);

        head.next.next = head;

        head.next = null;

        return newHead;
    }

}
