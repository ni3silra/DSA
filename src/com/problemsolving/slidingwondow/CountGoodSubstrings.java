package com.problemsolving.slidingwondow;

import java.util.*;

public class CountGoodSubstrings {
    public int countGoodSubstrings(String s) { //
        int k = 3;
        int count = 0;
        List<Character> window = new ArrayList<>();

        for(int i =0;i<k;i++){  // ab
            window.add(s.charAt(i));
        }

        for(int i = k;i<s.length();i++){ // ba,ba,ab,abc,bca,cba,abc
            if(window.size()==k && countCharInWindow(window) == 3){
                count++;
            }
            window.remove(0);
            window.add(s.charAt(i));
        }
        return count;
    }

    private int countCharInWindow(List<Character> window) {
        return new HashSet<>(window).size();
    }

    public static void main(String[] args) {
        System.out.println(new CountGoodSubstrings().countGoodSubstrings("aababcabc"));
    }
}
