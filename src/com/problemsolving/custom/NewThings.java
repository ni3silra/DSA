package com.problemsolving.custom;

import java.util.*;

public class NewThings {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.stream().mapToInt(i->i).sum());
    }
}
