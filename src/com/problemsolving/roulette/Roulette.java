package com.problemsolving.roulette;

public class Roulette {
    private double totalAmount = 0;
    private int profit = 0;
    private int currentBank = 0;
    private final int round;
    private final int coinChosen;
    private static double percentage;
    private static int count = 0;

    public Roulette(int round, int coinChosen) {
        this.round = round;
        this.coinChosen = coinChosen;
    }

    public void start() {
        startRoulette(round, coinChosen);
        System.out.println("TotalRequiredAmount : " + totalAmount);
        System.out.println("WinAmount : " + profit);
        System.out.println("currentBank : " + currentBank);
        System.out.println("Total Back Home: " + (currentBank + profit));
        double profitOrLoss = currentBank + profit - totalAmount;
        if (profitOrLoss > 0)
            System.out.println(".......PROFIT......" + profitOrLoss);
        else
            System.out.println(".......LOSS......" + profitOrLoss);
        profitOrLoss = profitOrLoss < 0 ? -1 * profitOrLoss : profitOrLoss;
        double perc = (profitOrLoss / totalAmount);
        System.out.println("......PERCENTAGE......" + perc * 100);
        percentage += (currentBank + profit - totalAmount) / totalAmount;
        count++;
    }

    public double getPercentage() {
        return percentage / count;
    }

    private void startRoulette(int round, int amount) {
        if (round == 0) return;
        totalAmount += amount * 2;
        int winAmount = putOddRedAndSpin(amount);
        System.out.println("Round " + round + " :- " + "putting Amount " + amount + " | Win Amount " + " - " + winAmount);
        if (winAmount == amount * 4) {
            profit += amount * 3;
            currentBank += amount;
        }
        if (winAmount == 0) {
            profit -= amount;
            currentBank -= amount;
            startRoulette(round - 1, amount * 2);
        }
        if (winAmount == amount) {
            startRoulette(round - 1, amount);
        }
        if (winAmount == amount * 2) {
            profit += amount;
            currentBank += amount;
            startRoulette(round - 1, amount);
        }
        if (winAmount == amount * 3) {
            profit += amount * 2;
            currentBank += amount;
            startRoulette(round - 1, amount);
        }
    }

    private int putOddRedAndSpin(int amount) {
        GameBoard.getRandom();
        return GameBoard.putODD(amount) + GameBoard.putRed(amount);
    }
}
