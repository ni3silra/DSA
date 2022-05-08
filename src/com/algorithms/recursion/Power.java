package com.algorithms.recursion;

public class Power {

    static int pow(int base, int power) {
        if (power == 0) return 1;
        int halfPow = pow(base,power/2);
        return power % 2 == 0 ? halfPow * halfPow : base * halfPow * halfPow;
    } // log(power) base 2

    public static void main(String[] args) {
        System.out.println(pow(2,9));
    }
}
