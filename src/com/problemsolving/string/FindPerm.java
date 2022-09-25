package com.problemsolving.string;

import java.util.HashMap;

public class FindPerm {

    int countPerm(String bigString, String smallString) {
        int count = 0;

        HashMap<Character, Integer> sMap = getMapFromString(smallString);

        for (int i = 0; i < bigString.length(); i++) {
            count++;
        }

        return count;
    }

    private HashMap<Character, Integer> getMapFromString(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : string.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        return map;
    }
}
