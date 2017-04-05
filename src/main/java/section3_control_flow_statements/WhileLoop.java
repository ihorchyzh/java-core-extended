package section3_control_flow_statements;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

//        The same in for loop
//
//        for (int i = 0; i < 7; i++) {
//            System.out.println("Count value is " + count);
//        }

        System.out.println();

        int count1 = 1;
        while (true) {
            if (count1 == 6) {
                break;
            }
            System.out.println("Count value is " + count1);
            count1++;
        }

        System.out.println();

        int count2 = 6;

//      Code never executes
        while (count2 != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        int count3 = 0;

//      Executes at least once
        do {
            System.out.println("Count value was " + count3);
            count3++;
            if (count3 > 100) {
                break;
            }
        } while (count3 != 110);

        System.out.println();

        int startNumber = 5;
        int endNumber = 20;

        while (startNumber < endNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }
            System.out.println("Even number " + startNumber);
            startNumber++;
        }

        System.out.println();

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int startNumber1 = 5;
        int endNumber1 = 20;
        int evensFound = 0;

        while (startNumber1 <= endNumber1) {
            if (!isEvenNumber(startNumber1)) {
                startNumber1++;
                continue;
            }

            System.out.println("Even number " + startNumber1);
            startNumber1++;

            evensFound++;
            if (evensFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evensFound);

    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
