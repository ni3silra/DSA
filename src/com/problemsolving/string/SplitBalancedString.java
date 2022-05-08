package com.problemsolving.string;

public class SplitBalancedString {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LRLLRR"));
    }

    public static int balancedStringSplit(String s) {
        int countBal = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') countBal++;
            else countBal--;
            if (countBal == 0) count++;
        }
        return count;
    }
}
