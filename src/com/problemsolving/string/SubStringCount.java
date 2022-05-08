package com.problemsolving.string;

import java.util.Arrays;

//Number of Strings That Appear as Substrings in Word
public class SubStringCount {
    public int numOfStrings(String[] patterns, String word) {
        return (int) Arrays.stream(patterns).filter(word::contains).count();
    }
}
