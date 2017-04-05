package section2_expressions_statements_methods;

/**
 * Created by ihorchyzh on 4/1/17.
 */
public class MethodOverloading {

    public static void main(String[] args) {

        calculateScore("Ihor", 1000);
        calculateScore(750, "Chyzh");
        calculateScore(75);
        calculateScore();

        // Сall the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        calcFeetAndInchesToCentimeters(10, 10);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score;
    }

    public static int calculateScore(int score, String playerName) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score;
    }

    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + " points");
        return score;
    }

    public static int calculateScore() {
        System.out.println("No scored points");
        return 0;
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=20
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 20) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches.");
            return -1;
        }
    }

    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    //
    // But if its valid, then calculate how many feet are in the inches

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches.");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
