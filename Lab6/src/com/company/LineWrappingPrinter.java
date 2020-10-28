package com.company;

public class LineWrappingPrinter extends PrinterDecorator {
    private int lineLength;
    public LineWrappingPrinter(Printer p, int lineLength) {
        super(p);
        this.lineLength = lineLength;
    }

    @Override
    public void print(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i + this.lineLength < sb.length() && (i = sb.lastIndexOf(" ", i + this.lineLength)) != -1) {
            sb.replace(i, i + 1, "\n");
        }

        super.print(sb.toString());
    }
}
