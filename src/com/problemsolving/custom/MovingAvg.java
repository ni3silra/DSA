package com.problemsolving.custom;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAvg {

    int size;
    Queue<Integer> queue;
    int currentSum;

    public MovingAvg(int size) {
        this.size = size;
        queue = new LinkedList<>();
        currentSum = 0;
    }

    public double next(int val) {
        if (queue.size() == size)
            currentSum -= queue.remove();
        queue.add(val);
        currentSum += val;
        return (double) currentSum / queue.size();
    }
}
