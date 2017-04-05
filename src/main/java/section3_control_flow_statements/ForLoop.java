package section3_control_flow_statements;

/**
 * Created by ihorchyzh on 4/4/17.
 */
public class ForLoop {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateIntrest(10000, 2));
        System.out.println("10,000 at 3% interest = " + calculateIntrest(10000, 3));
        System.out.println("10,000 at 4% interest = " + calculateIntrest(10000, 4));
        System.out.println("10,000 at 5% interest = " + calculateIntrest(10000, 5));
        System.out.println();

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        for (double i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateIntrest(10000, i));
        }

        System.out.println();

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (double i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateIntrest(10000, i));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        System.out.println();

        int startRange = 10;
        int endRange = 50;
        int count = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static double calculateIntrest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

}
