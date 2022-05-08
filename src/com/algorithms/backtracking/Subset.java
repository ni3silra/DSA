package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Subset {

    static List<List<Integer>> listOfList = new ArrayList<>();

    public static void main(String[] args) {
        generate(List.of(1, 2, 3), new ArrayList<>(),0);
        listOfList.sort(Comparator.comparingInt(List::size));
        System.out.println(listOfList.size() + " : - " + listOfList);
    }

    static void generate(List<Integer> input, List<Integer> output, int index) {
        // base case
        if (index == input.size()) {
            listOfList.add(new ArrayList<>(output));
            return;
        }

        // without adding new element
        generate(input, new ArrayList<>(output), index + 1);

        // with adding new element
        output.add(input.get(index));
        generate(input, new ArrayList<>(output), index + 1);
    }
}
