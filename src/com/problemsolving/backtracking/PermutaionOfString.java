package com.problemsolving.backtracking;

import java.util.*;

public class PermutaionOfString {
    public static void main(String[] args) {
          PermutaionOfString permuteString = new PermutaionOfString();
            System.out.println(permuteString.getAllString(new String[]{"foo","bar"}));
    }

    private List<String> getAllString(String[] words){
        List<String> allString = new ArrayList<>();
        getAllPermutation(words,0,allString, "");
        return allString;
    }

    void getAllPermutation(String[] words,int index,List<String> allString,String curr){
        if(index == words.length-1){
            allString.add(curr);
            return;
        }

        for(int i = index+1;i<words.length;i++){
            getAllPermutation(words,i,allString,curr + words[i]);
        }
    }
}
