package com.problemsolving.linkedlist;

public class ListNode {
	public int val;
	public ListNode next;

	static ListNode createListNode(int x) {
		return new ListNode(x);
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

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

}
