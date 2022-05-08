package com.problemsolving.string;

public class LongestPalindromicSubstring {

    int left=0,right=0;

    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            isPalindrome(i,i,s);
            isPalindrome(i,i+1,s);
        }
        return s.substring(left,right);
    }

    void isPalindrome(int l, int r, String s){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(right-left < (r-l-1)){
            left=l+1;
            right=r;
        }
    }

}
