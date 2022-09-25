package com.other;

public class App {
    public static void main(String[] args) {
        // Old Style code
        CalculateDouble calculateDouble = new CalculateDoubleImpl();
        System.out.println(calculateDouble.doubleIt(5));

        // FP
        CalculateDouble calculateDouble2 = n -> n * 2;
        System.out.println(calculateDouble2.doubleIt(10));
    }
}
