package com.problemsolving.arrays;

public class FillCups {

    public int fillCups(int[] amount) {
        int seconds = 0;

        while (amount[0] != 0 && amount[1] != 0) {
            amount[0]--;
            amount[1]--;
            seconds++;
        }

        while (amount[1] != 0 && amount[2] != 0) {
            amount[1]--;
            amount[2]--;
            seconds++;
        }

        while (amount[0] != 0 && amount[2] != 0) {
            amount[0]--;
            amount[2]--;
            seconds++;
        }


        for (int i = 0; i < 3; i++) {
            seconds += amount[i];
        }

        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(new FillCups().fillCups(new int[]{5,4,4}));
    }

}
