package com.problemsolving.linkedlist;

public class RemoveLinkedListElements {

   public static void main(String[] args) {
        System.out.println(removeElements(ListNode.getListNodeFromArray(new int[]{1, 2, 6, 3, 4, 5, 6}), 6));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while (head != null) {
            if (head.val == val)
                head = head.next.next;
            head = head.next;
        }
        return temp;
    }

}
