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

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
