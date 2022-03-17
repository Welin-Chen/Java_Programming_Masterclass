package com.welin;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);

    }

    public static int calculateScore(boolean isGameOver, int score,
                                     int levelCompleted, int bonus) {
        if (isGameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
