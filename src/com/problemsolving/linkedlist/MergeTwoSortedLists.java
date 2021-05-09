package com.problemsolving.linkedlist;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		/*
		 * a dummy first node to hang the result on
		 */
		ListNode dummyNode = new ListNode(0);
		/*
		 * tail points to the last result node
		 */
		ListNode tail = dummyNode;
		while (true) {

			/*
			 * if either list runs out, use the other list
			 */
			if (A == null) {
				tail.next = B;
				break;
			}
			if (B == null) {
				tail.next = A;
				break;
			}

			if (A.val <= B.val) {
				tail.next = A;
				A = A.next;
			} else {
				tail.next = B;
				B = B.next;
			}

			/* Advance the tail */
			tail = tail.next;
		}
		return dummyNode.next;
	}
}
