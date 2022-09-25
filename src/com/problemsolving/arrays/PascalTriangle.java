package com.problemsolving.arrays;

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(new PascalTriangle().solve(5));
    }

    public ArrayList<Integer> generate(int A) {
        int numRows = A + 1;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {

            res.add(new ArrayList<>());

            res.get(i).add(1);

            for (int j = 0; j < i - 1; j++) {
                int num = res.get(i - 1).get(j) + res.get(i - 1).get(j + 1);
                res.get(i).add(num);
            }

            res.get(i).add(1);

        }

        return res.get(res.size() - 1);
    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));
        for (int i = 1; i < A; i++) {
            ArrayList<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 0; j < i - 1; j++)
                current.add(res.get(i - 1).get(j) + res.get(i - 1).get(j + 1));
            current.add(1);
            res.add(new ArrayList<>(current));
        }
        return res;
    }
}
