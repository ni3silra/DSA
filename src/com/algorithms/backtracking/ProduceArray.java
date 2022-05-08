package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class ProduceArray {

    static List<List<Integer>> listOfList = new ArrayList<>();

    static void produce(List<Integer> curr,int n){
        if(curr.size() == n) {
            listOfList.add(new ArrayList<>(curr));
            return;
        }

        curr.add(0);
        produce(curr,n);
        curr.remove(Integer.valueOf(0));

        curr.add(1);
        produce(curr,n);
        curr.remove(Integer.valueOf(1));
    }

    public static void main(String[] args) {
        produce(new ArrayList<>(),3);
        System.out.println(listOfList);
    }


}
