package section2;

/**
 * Created by ihorchyzh on 3/29/17.
 */
public class CodeBlocksAndIfThenElse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000!");
        } else if (score == 5000) {
            System.out.println("Your score was exactly 5000!");
        } else {
            System.out.println("Your score was more than 5000!");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);     //"int finalScore" is the method variable
            System.out.println("Your new final score is " + finalScore);    //it live only during method works
        }


    }

}
