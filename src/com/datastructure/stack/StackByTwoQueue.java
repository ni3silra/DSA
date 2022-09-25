package com.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackByTwoQueue implements Stack<Integer>{

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    @Override
    public void pop() {
         queue1.poll();
    }

    @Override
    public void push(Integer element) {
        // push to q2
        queue2.offer(element);
        // push to q1 to q2
        while(!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        // swap q1,q1
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    @Override
    public Integer peek() {
        return queue1.peek();
    }

    @Override
    public int size() {
        return queue1.size();
    }

    @Override
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
