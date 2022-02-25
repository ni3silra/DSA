package com.problemsolving.linkedlist;

public class DetectCycle {

    public static void main(String[] args) {
        System.out.println(hasCycle(ListNode.getListNodeFromArray(new int[]{1,2})));
    }

    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;

        ListNode slow  = head;
        ListNode fast = slow.next;

        while(slow != fast){
            if(fast == null|| fast.next== null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
