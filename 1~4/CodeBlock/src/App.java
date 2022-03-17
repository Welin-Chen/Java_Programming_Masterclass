public class App {
    public static void main(String[] args) throws Exception {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = caculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("finalScore = " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = caculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("finalScore = " + finalScore);

        String player;
        int position;

        position = caculateHighScorePosition(score = 1500);
        displayHighScorePosition(player = "p1", position);

        position = caculateHighScorePosition(score = 900);
        displayHighScorePosition(player = "p2", position);

        position = caculateHighScorePosition(score = 400);
        displayHighScorePosition(player = "p3", position);

        position = caculateHighScorePosition(score = 50);
        displayHighScorePosition(player = "p4", position);

        position = caculateHighScorePosition(score = 1000);
        displayHighScorePosition(player = "p5", position);

        position = caculateHighScorePosition(score = 500);
        displayHighScorePosition(player = "p6", position);

        position = caculateHighScorePosition(score = 100);
        displayHighScorePosition(player = "p7", position);
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score talbe");
    }

    public static int caculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static int caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

}
