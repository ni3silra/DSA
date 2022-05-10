package com.problemsolving.bitmanipulation;

public class NumberComplement {

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        int res = 0;
        int powerOf2 = 1;
        while (num > 0) {
            if (num % 2 == 0)
                res += powerOf2;
            powerOf2 <<= 1;
            num >>= 1;
        }
        return res;
    }
}
