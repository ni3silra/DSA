package com.problemsolving.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        Objects.requireNonNull(slidingMaximum(List.of(1, 3, -1, -3, 5, 3, 6, 7), 3)).forEach(System.out::println);
        System.out.println("======");
        Objects.requireNonNull(slidingMaximum(List.of(1, 2, 3, 4, 2, 7, 1, 3, 6), 6)).forEach(System.out::println);
        System.out.println("======");
        Objects.requireNonNull(slidingMaximum(List.of(1), 1)).forEach(System.out::println);
    }

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        if (B > A.size())
            return null;
        ArrayList<Integer> result = new ArrayList<>();
        int[] maxArray = new int[2];
        getMax2Element(A, B, maxArray);
        result.add(maxArray[0]);
        for (int i = B; i < A.size(); i++) {
            getMax2Element(A, B, maxArray);
            result.add(maxArray[0]);
        }
        return result;
    }

    private static void getMax2Element(List<Integer> A, int B, int[] maxArray) {
        maxArray[0] = Integer.MIN_VALUE;
        maxArray[1] = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {
            maxArray[0] = Math.max(maxArray[0], A.get(i));
        }
        for (int i = 0; i < B; i++) {
            if (maxArray[0] != A.get(i))
                maxArray[1] = Math.max(maxArray[1], A.get(i));
        }
    }


}
