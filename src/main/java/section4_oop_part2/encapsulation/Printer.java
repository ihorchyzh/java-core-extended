package section4_oop_part2.encapsulation;

/**
 * Created by ihorchyzh on 5/8/17.
 */
public class Printer {

    private int tonerLevel = 100;
    private int printerPagesCount;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.printerPagesCount = 0;
    }

    public int fillUpToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printingPage(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.printerPagesCount += pagesToPrint;
        return pagesToPrint;
    }

    public int getPrinterPagesCount() {
        return printerPagesCount;
    }
}

