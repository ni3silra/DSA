package com.problemsolving.linkedlist;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode result = mergeTwoLists(
                ListNode.getListNodeFromArray(new int[]{1, 4, 7})
                , ListNode.getListNodeFromArray(new int[]{2, 3, 6})
        );

        System.out.println(result);
    }

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        while (true) {
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
            tail = tail.next;
        }
        return dummyNode.next;
    }
}
