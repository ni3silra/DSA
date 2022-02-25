package com.datastructure.map;

import java.util.Arrays;

public class MyHashMap {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(2633,996);
        System.out.println(map);
    }

    Pair[] pairs;
    int cap = (int) Math.pow(10,2);

    public MyHashMap() {
        pairs = new Pair[cap];
    }

    public void put(int key, int value) {
        if(pairs.length <= key)
            expand(key + 1);
        pairs[key] = new Pair(key,value);
    }

    public int get(int key) {
        if(key < pairs.length && pairs[key] != null)
            return pairs[key].value;
        return -1;
    }

    public void remove(int key) {
        if(key < pairs.length && pairs[key] != null)
            pairs[key] = null;
    }

    public void expand(int newCap){
        pairs = Arrays.copyOf(pairs, newCap);
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "pairs=" + Arrays.toString(pairs) +
                '}';
    }
}


class Pair{
     int key, value;
     Pair(int key,int value){
        this.key = key;
        this.value = value;
    }

     @Override
     public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}