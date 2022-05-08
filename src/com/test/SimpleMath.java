package com.test;

public class SimpleMath {

    public static void main(String[] args) {
        System.out.println(perform(100));
    }
     static int perform(int i ){
        if(i == 1) return 0;
        if(i % 2 == 0)
            perform(i/2);
        else
            perform((3*i)+1);
        return 0;
    }
}
