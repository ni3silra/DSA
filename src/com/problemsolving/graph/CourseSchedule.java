package com.problemsolving.graph;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> al = new HashMap<>();
        for (int[] pre : prerequisites) {
            if (al.get(pre[0]) == null) {
                al.put(pre[0], new ArrayList<>(List.of(pre[1])));
            } else {
                al.get(pre[0]).add(pre[1]);
            }
        }

        boolean[] visited = new boolean[numCourses];
        Queue<Integer> queue = new LinkedList<>();

        for(int key : al.keySet()){
            for (int i : al.get(key)){

            }
        }

        return true;
    }
}
