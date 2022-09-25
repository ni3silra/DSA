package com.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackByArray implements Stack<Integer> {

    List<Integer> list = new ArrayList<>();
    int top = -1;

    @Override
    public void pop() {
        list.remove(top--);
    }

    @Override
    public void push(Integer element) {
        list.add(element);
        top++;
    }

    @Override
    public Integer peek() {
        return list.get(top);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
