package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/4/17.
 */
public class PC {
    private Case theCase;  // has a?
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Draw some)
        monitor.drawPixelAt(1200,50, "green");
    }

}
