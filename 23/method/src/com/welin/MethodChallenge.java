package com.welin;

public class MethodChallenge {
    public static void main(String[] args) {
        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Andy", playerScore);

        displayHighScorePosition("Mary", calculateHighScorePosition(900));
        displayHighScorePosition("Vicky", calculateHighScorePosition(400));
        displayHighScorePosition("Bob", calculateHighScorePosition(50));

        displayHighScorePosition("test",calculateHighScorePosition(1000));
        displayHighScorePosition("test",calculateHighScorePosition(500));
        displayHighScorePosition("test",calculateHighScorePosition(100));
        displayHighScorePosition("test",calculateHighScorePosition(99));

    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " on the high score table.");
    }
}
