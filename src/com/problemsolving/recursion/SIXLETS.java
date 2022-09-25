package com.problemsolving.recursion;

import java.util.*;

public class SIXLETS {

    public static void main(String[] args) {
        System.out.println(new SIXLETS()
                .solve(new ArrayList<Integer>(Arrays.asList(508, 503, 412, 895, 256, 89, 245, 567, 9, 123)), 5));
    }

    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> current = new ArrayList<>();
        return helper(A, current, B, 0, 0);
    }

    public int helper(ArrayList<Integer> input, ArrayList<Integer> currentList, int requiredSize, int currentIndex, int sum) {
        if (currentIndex == input.size()) {
            if (sum <= 1000 && currentList.size() == requiredSize) {
                return 1;
            } else {
                return 0;
            }
        }

        Integer currentElement = input.get(currentIndex);

        // add
        sum += currentElement;
        currentList.add(currentElement);
        int pickCount = helper(input, currentList, requiredSize, currentIndex + 1, sum);

        // remove
        sum -= currentElement;
        currentList.remove(currentElement);
        int notPickCount = helper(input, currentList, requiredSize, currentIndex + 1, sum);

        return pickCount + notPickCount;
    }
}


