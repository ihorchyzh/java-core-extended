package section4_oop_part2.encapsulation;

/**
 * Created by ihorchyzh on 5/8/17.
 */
public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.playerName = "Ihor";
//        player.playerHealth = 100;
//        player.playerWeapon = "Sword";
//
//        int damage = 70;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Ihor", 200, "Sword");
//        System.out.println("Initial health is " + enhancedPlayer.getHealth());

        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer printer = new Printer(50, false);
        System.out.println("Initial pages count = " + printer.getPrinterPagesCount());
        System.out.println("Pages printed was " + printer.printingPage(4) + ", new total print count " +
                "for printer = " + printer.getPrinterPagesCount());
        System.out.println("Pages printed was " + printer.printingPage(2) + ", new total print count " +
                "for printer = " + printer.getPrinterPagesCount());

    }
}
