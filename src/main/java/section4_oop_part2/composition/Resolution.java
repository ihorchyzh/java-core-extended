package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/4/17.
 */
public class Resolution {

    private int with;
    private int high;

    public Resolution(int with, int high) {
        this.with = with;
        this.high = high;
    }

    public int getWith() {
        return with;
    }

    public int getHigh() {
        return high;
    }
}
