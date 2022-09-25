package com.problemsolving.queue;

import com.datastructure.list.ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || A.size() == 0 || B == null || B.size() == 0)
            return 0;
        Queue<Integer> taskQueue = getTaskQueue(A);
        int taskCycle = 0;
        for (int requiredTaskIndex = 0; requiredTaskIndex < B.size(); ) {
            Integer currentTask = taskQueue.peek();
            Integer requiredTask = B.get(requiredTaskIndex);
            if (currentTask == null || requiredTask == null)
                break;
            requiredTaskIndex = getRequiredTaskIndex(taskQueue, requiredTaskIndex, currentTask, requiredTask);
            taskCycle++;
        }
        return taskCycle;
    }

    private Queue<Integer> getTaskQueue(ArrayList<Integer> A) {
        Queue<Integer> taskQueue = new LinkedList<>();
        A.forEach(taskQueue::add);
        return taskQueue;
    }

    private int getRequiredTaskIndex(Queue<Integer> taskQueue, int requiredTaskIndex, Integer currentTask, Integer requiredTask) {
        if (currentTask.equals(requiredTask)) {
            taskQueue.poll();
            requiredTaskIndex++;
        } else {
            taskQueue.offer(taskQueue.poll());
        }
        return requiredTaskIndex;
    }
}


/*      A = [2, 3, 1, 5, 4]
        B = [1, 3, 5, 4, 2]

        1-> 3  [ 5 4 2 3 ]
        3-> 4  [ 5 4 2 ]
        5-> 1  [ 4 2 ]
        4-> 1  [ 2 ]
        2-> 1  [ ]
*/