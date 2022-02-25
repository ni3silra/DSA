package com.problemsolving.linkedlist;

import com.datastructure.list.List;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(ListNode next) {
        val = next.val;
        this.next = next.next;
    }

    public ListNode getNext() {
        return next;
    }

    static ListNode createListNode(int x) {
        return new ListNode(x);
    }


    public ListNode() {
        val = 0;
        next = null;
    }

    public ListNode(int val) {
        super();
        this.val = val;
        this.next = null;
    }

    public ListNode setVal(int val) {
        this.val = val;
        return this;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    static ListNode getListNodeFromArray(int[] array) {
        ListNode listNode = new ListNode();
        ListNode temp = listNode;
        for (int val : array) {
            temp.next = createListNode(val);
            temp = temp.next;
        }
        return listNode.next;
    }

    public static ListNode clone(ListNode head) {
        return (head == null) ? null : new ListNode(head.val, clone(head.next));
    }

    public int size() {
        int size = 0;
        ListNode current = this;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }


    public boolean detectCycle() {
        ListNode slow = this, fast = slow.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    @Override
    public String toString() {
        return "ListNode [val=" + val + ", next=" + next + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(val);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        ListNode first = this;
        ListNode second = (ListNode) obj;
        if (first.size() == second.size()) {
            while (first != null || second != null) {
                if (first.val != second.val) return false;
                first = first.next;
                second = second.next;
            }
            return true;
        }
        return false;
    }
}
