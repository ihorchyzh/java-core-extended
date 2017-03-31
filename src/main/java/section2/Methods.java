package section2;

/**
 * Created by ihorchyzh on 3/31/17.
 */
public class Methods {

    public static void main(String[] args) {

        calculateScore();
        calculateScoreParams(true, 10000, 8, 200);

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        calculateScoreParams(newGameOver, newScore, newLevelCompleted, newBonus);

        int finalScore = calculateScoreReturn();
        System.out.println("Your new final score is " + finalScore);

        //Players
        String nameIhor = "Ihor";
        int scoreIhor = 1500;

        String nameMark = "Mark";
        int scoreMark = 900;

        String nameTim = "Tim";
        int scoreTim = 400;

        String nameSteve = "Steve";
        int scoreSteve = 50;

        displayHighScorePosition(nameIhor, calculateHighScorePosition(scoreIhor));
        displayHighScorePosition(nameMark, calculateHighScorePosition(scoreMark));
        displayHighScorePosition(nameTim, calculateHighScorePosition(scoreTim));
        displayHighScorePosition(nameSteve, calculateHighScorePosition(scoreSteve));

    }

    public static void calculateScore() {
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your new final score is " + finalScore);
        }
    }

    public static void calculateScoreParams(boolean newGameOver, int newScore, int newLevelCompleted, int newBonus) {
        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your new final score is " + finalScore);
        }
    }

    public static int calculateScoreReturn() {
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            return finalScore;
        } else {
            return -1;
        }
    }

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50


    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position #" +
                playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 1000) {
            return 1;
        } else return 4;
    }

}
