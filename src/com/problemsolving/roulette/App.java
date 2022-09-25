package com.problemsolving.roulette;

public class App {

    public static void main(String[] args) {
        Roulette roulette = new Roulette(10,500);
        roulette.start();
        roulette.start();
//        roulette.start();
//        roulette.start();
//        roulette.start();
        System.out.println("FINAL PROFIT :- " + roulette.getPercentage()*100);
    }
}
