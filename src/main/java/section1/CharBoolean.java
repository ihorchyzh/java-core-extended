package section1;

/**
 * Created by ihorchyzh on 3/22/17.
 */
public class CharBoolean {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was the: " + myChar + " - copyright symbol");

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // https://unicode-table.com/en/
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol is the: " + registeredSymbol);

    }

}
