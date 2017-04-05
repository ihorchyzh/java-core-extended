package section3_control_flow_statements;

/**
 * Created by ihorchyzh on 4/1/17.
 */
public class Switch {

    public static void main(String[] args) {

        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else if (value == 3) {
            System.out.println("Value was 3");
        }

        int intValue = 7;

        switch (intValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:
                System.out.println("Value was 4");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.print("Value was 5 or 6 or 7 or 8 or 9 or 10. ");
                System.out.println("Actually it was " + intValue + ".");
                break;
            default:
                System.out.println("Value isn't in list.");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'D';

        switch (charValue) {
            case 'A':
                System.out.println("Found A.");
                break;
            case 'B':
                System.out.println("Found B.");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found " + charValue);
                break;
            default:
                System.out.println("Sorry, the Char not found A, B, C, D or E.");
        }

        String month = "February";

        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter is coming.");
                break;
            default:
                System.out.println("Its Summer, Spring or Autumn.");
        }

    }

}
