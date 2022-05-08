package com.problemsolving.arrays;

import java.util.Arrays;

public class Max2Element {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 4};

        Arrays.stream(getMax2(arr))
                .forEach(System.out::println);

    }

    public static int[] getMax2(int[] arr) {
        int largest1 = arr[0];
        int largest2 = arr[0];

        for (int e : arr)
            if (e > largest1) {
                largest2 = largest1;
                largest1 = e;
            } else
                largest2 = Math.max(largest2, e);

        return new int[]{largest1, largest2};
    }
}
