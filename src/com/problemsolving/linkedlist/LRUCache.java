package com.problemsolving.linkedlist;

import java.util.*;

class Node{
    int key;
    int value;

    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}


public class LRUCache {
    Map<Integer,Node> map;
    LinkedList<Node> dq;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        dq = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null)
            return -1;
        addToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node == null){
            node = new Node(key,value);
            map.put(key,node);
            dq.addFirst(node);
            capacity--;

            if(capacity < 0){
                Node deleteNode = dq.removeLast();
                map.remove(deleteNode.key);
                capacity++;
            }
        }else{
            node.value = value;
            addToHead(node);
        }
    }

    private void addToHead(Node node){
        dq.remove(node);
        dq.addFirst(node);
    }
}
