package com.problemsolving.hashing;

import java.util.LinkedList;

class LRUCache {

    LinkedList<Integer> dll;
    int currentCapacity ;
    public LRUCache(int capacity) {
        dll = new LinkedList<>();
        currentCapacity = 0;
    }

    public int get(int key) {
        return -1;
    }

    public void put(int key, int value) {

    }
}
