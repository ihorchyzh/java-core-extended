package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/7/17.
 */
public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quils;

    public Bed(String style, int pillows, int height, int sheets, int quils) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quils = quils;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuils() {
        return quils;
    }
}
