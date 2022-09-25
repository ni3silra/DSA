package com.problemsolving.math;

import java.util.*;

public class FractionToRecurringDecimal {

    public static void main(String[] args) {
        double ans = (double) 4 / 333;
        System.out.println(ans);
        System.out.println(fractionToDecimal(4, 333));
    }


    public static String fractionToDecimal(int numerator, int denominator) {
        double ans = (double) numerator / denominator;
        String[] ansS = String.valueOf(ans).split("\\.");

        if (ansS.length < 2) {
            return String.valueOf((int) ans);
        }

        Set<String> set = new HashSet<>();
        StringBuilder buffer = new StringBuilder();

        for (char c : ansS[1].toCharArray()) {
            buffer.append(c);
            if (!set.add(buffer.toString())) {
                break;
            }
        }

        if (buffer.length() == ansS[1].length())
            return ansS[0] + "." + ansS[1];
        return ansS[0] + ".(" + buffer.toString() + ")";
    }
}
