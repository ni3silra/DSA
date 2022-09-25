package com.problemsolving.roulette;

import java.util.List;

public class GameBoard {
    private static final List<RNumber> list = RNumber.getAllNumber();
    private static RNumber rNumber;

    static void getRandom() {
        rNumber = spin();
    }

    private static RNumber spin() {
        return list.get((int) (Math.random() * 36));
    }

    public static int putNumber(int amount, int num) {
        return rNumber.getNum() == num ? amount * 36 : 0;
    }

    public static int putODD(int amount) {
        return !rNumber.isEven() ? amount * 2 : 0;
    }

    public static int putEven(int amount) {
        return rNumber.isEven() ? amount * 2 : 0;
    }

    public static int putRed(int amount) {
        return rNumber.color == Color.RED ? amount * 2 : 0;
    }

    public static int putBlack(int amount) {
        return rNumber.color == Color.BLACK ? amount * 2 : 0;
    }
}
