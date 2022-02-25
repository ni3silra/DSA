package com.problemsolving.linkedlist;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        System.out.println(getDecimalValue(ListNode.getListNodeFromArray(new int[]{1,0,1})));
    }


    public static int getDecimalValue(ListNode head) {
        int num = 0;
        int pow = head.size()-1;

        while(head != null){
            num+= head.val * Math.pow(2,pow--);
            head =head.next;
        }

        return num;
    }
}
