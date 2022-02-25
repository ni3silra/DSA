package com.problemsolving.linkedlist;

public class AddTwoNumbersAsLists {

	public static void main(String[] args) {
		System.out.println(new AddTwoNumbersAsLists().addTwoNumbers(
				ListNode.createListNode(2).setNext(ListNode.createListNode(4)).setNext(ListNode.createListNode(3)),
				ListNode.createListNode(5).setNext(ListNode.createListNode(6)).setNext(ListNode.createListNode(4))));
	}

	public ListNode addTwoNumbers(ListNode A, ListNode B) {
		int sizeA = getSize(A);
		int sizeB = getSize(B);
		int size = Math.max(sizeA, sizeB);

		return null;
	}

	private ListNode addZeroInHead(ListNode node, int number) {

		return null;
	}

	private int getSize(ListNode node) {
		int size = 0;

		ListNode temp = node;

		while (node != null) {
			temp = temp.next;
			size++;
		}

		return size;
	}

}
