package com.problemsolving.roulette;


import java.util.ArrayList;
import java.util.List;

public class RNumber {

    int num;
    Color color;
    boolean isEven;

    private RNumber(int num) {
        this.num = num;
        this.isEven = num % 2 == 0;
    }

    public static List<RNumber> getAllNumber() {
        List<RNumber> rNumberList = new ArrayList<>();
        for (int i = 0; i < 37; i++) {
            RNumber rNumber = new RNumber(i);
            rNumber.setColor();
            rNumberList.add(rNumber);
        }
        return rNumberList;
    }

    private void setColor() {
        if (num >= 1 && num <= 10) {
            this.color = isEven ? Color.BLACK : Color.RED;
        } else if (num >= 11 && num <= 18) {
            this.color = !isEven ? Color.BLACK : Color.RED;
        } else if (num >= 19 && num <= 28) {
            this.color = isEven ? Color.BLACK : Color.RED;
        } else if (num >= 29 && num <= 36) {
            this.color = !isEven ? Color.BLACK : Color.RED;
        } else {
            this.color = Color.GREEN;
        }
    }

    @Override
    public String toString() {
        return "RNumber{" +
                "num=" + num +
                ", color=" + color +
                ", isEven=" + isEven +
                '}' + "\n";
    }

    public int getNum() {
        return num;
    }

    public Color getColor() {
        return color;
    }

    public boolean isEven() {
        return isEven;
    }
}
