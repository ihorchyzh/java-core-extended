package section1_variables_datatypes_operators;

/**
 * Created by ihorchyzh on 3/22/17.
 */
public class ByteShortIntLong {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        // byte has with of 8
        byte byteValue = 10;
        // short has with of 16
        short shortValue = 20;
        // int has with of 32
        int intValue = 50;
        // long has with of 64
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

    }

}
