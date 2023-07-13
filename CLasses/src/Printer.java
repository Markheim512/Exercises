public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (-1 < tonerLevel && tonerLevel <=100) this.tonerLevel = tonerLevel;
        else this.tonerLevel = -1;

        this.duplex = duplex;

        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || 100 < tonerAmount) return -1;
        if (tonerLevel + tonerAmount > 100) return -1;
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (pages < 0) return -1;
        int pagesToPrint = pages;
        if (duplex) {
            if (pagesToPrint % 2 == 1) pagesToPrint++;
            pagesToPrint /= 2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
