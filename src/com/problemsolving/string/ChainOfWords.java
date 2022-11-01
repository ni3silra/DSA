package com.problemsolving.string;

import java.util.Arrays;

public class ChainOfWords {
    public static void main(String[] args) {
        ChainOfWords chainOfWords = new ChainOfWords();
        System.out.println(chainOfWords.checkChain(new String[]{"eggs", "karat", "apple", "snack", "tuna"}));
        System.out.println(chainOfWords.checkChain(new String[]{"abc", "cba"}));
        System.out.println(chainOfWords.checkChain(new String[]{"es", "kt", "ae", "sk", "ta"}));
        System.out.println(chainOfWords.checkChain(new String[]{"eggsa", "karat", "apple", "snack", "tuna"}));
        System.out.println(chainOfWords.checkChain(new String[]{"eggs", "karatx", "apple", "snack", "tuna"}));
        System.out.println(chainOfWords.checkChain(new String[]{"eggs", "karat", "appley", "snack", "tuna"}));
    }

    private boolean checkChain(String[] words) {
        return isAllZero(getCharacterDiffOfStartAndEnd(words));
    }

    private int[] getCharacterDiffOfStartAndEnd(String[] words) {
        int[] charArray = new int[26];
        Arrays.stream(words).forEach(word -> perform(charArray, word));
        return charArray;
    }

    private void perform(int[] charArray, String word) {
        charArray[word.charAt(0) - 'a']++;
        charArray[word.charAt(word.length() - 1) - 'a']--;
    }

    private boolean isAllZero(int[] array) {
        return Arrays.stream(array)
                .noneMatch(c -> c != 0);
    }


}
