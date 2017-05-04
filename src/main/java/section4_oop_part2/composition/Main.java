package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 4/30/17.
 */
public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("U2312HM", "Dell", 27, new Resolution(1920, 1080));

        MotherBoard theMotherBoard = new MotherBoard("TT55", "Dell", 4, 6, "v443.3");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherBoard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }

}
