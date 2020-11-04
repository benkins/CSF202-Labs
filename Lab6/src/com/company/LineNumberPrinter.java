package com.company;

public class LineNumberPrinter extends PrinterDecorator{
    private int lineNumber = 0;
    public LineNumberPrinter(Printer p) {
        super(p);
    }

    @Override
    public void print(String s){
        super.print(this.lineNumber + ": " + s);
        this.lineNumber++;
    }
}
