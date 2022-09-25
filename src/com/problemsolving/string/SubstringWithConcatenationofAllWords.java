package com.problemsolving.string;

import java.util.*;

public class SubstringWithConcatenationofAllWords {

    public static void main(String[] args) {
        System.out.println(new SubstringWithConcatenationofAllWords().findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best","word"}));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<String> allStrings = getAllString(words);
        System.out.println(allStrings);
        List<Integer> ans = new ArrayList<>();
        int fromIndex = 0;
        for(String word : allStrings){
            int index = 0;
            while(index != -1){
                index = s.indexOf(word,fromIndex);
                if(index != -1){
                    ans.add(index);
                    fromIndex +=index + word.length();
                }
            }
        }
        return ans;
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

        for(int i = index;i<words.length;i++){
            getAllPermutation(words,i+1,allString,curr + words[i]);
        }
    }
}
