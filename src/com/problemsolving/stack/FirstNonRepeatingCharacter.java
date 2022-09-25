package com.problemsolving.stack;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(solve("abadbc").equals("aabbdd"));
        System.out.println(solve("abcabc").equals("aaabc#"));
    }

    public static String solve(String A) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder buffer = new StringBuilder();
        Character currentNonRepeatingChar = '#';
        for (char c : A.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            Optional<Map.Entry<Character, Integer>> firstNonRepeatingChar = map.entrySet().stream()
                    .filter(x -> x.getValue() == 1)
                    .findFirst();
            if (firstNonRepeatingChar.isPresent())
                currentNonRepeatingChar = firstNonRepeatingChar.get().getKey();
            buffer.append(currentNonRepeatingChar);
        }
        return buffer.toString();
    }
}
