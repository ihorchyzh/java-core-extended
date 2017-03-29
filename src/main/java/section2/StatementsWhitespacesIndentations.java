package section2;

/**
 * Created by ihorchyzh on 3/29/17.
 */
public class StatementsWhitespacesIndentations {

    public static void main(String[] args) {

        int myVariable = 50;    //this "int myVariable = 50;" is a statement
        myVariable++;           //this space "int myVariable" between is a white space
        myVariable--;           //this 2 tabs before myVariable--; is indentation
        System.out.println("This is a test" + myVariable);

        System.out.println("This is " +
                "another " +
                "test!");
    }

}
