package com.problemsolving.graph;

import java.util.*;

public class FindTheTownJudge {

    private void check() {
        Set<int[]> set = new TreeSet<>((a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return 0;
            }
            return 1;
        });
        TreeSet<int[]> a = new TreeSet<>(Comparator.comparingInt(t -> t[0]));
    }




    public static void main(String[] args) {
//        int[][] mat = {{1, 2}, {2, 3}};
//        System.out.println(findJudge(3, mat));
        String s = "Easter";
        //String s = new String("Easter");
        if (s == "Easter") {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }


    private static int findJudge(int n, int[][] trust) {
        Set<Integer> peopleSet = new HashSet<>();
        Set<Integer> possibleTJSet = new HashSet<>();

        for (int[] t : trust) {
            peopleSet.add(t[0]);
            possibleTJSet.add(t[1]);
        }

        for (int p : peopleSet)
            possibleTJSet.remove(p);

        if (possibleTJSet.size() == 1)
            for (int tj : possibleTJSet)
                return tj;
        return -1;
    }
}
