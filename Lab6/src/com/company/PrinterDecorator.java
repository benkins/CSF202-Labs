package com.company;

public abstract class PrinterDecorator implements Printer {

    private Printer printer;
    public PrinterDecorator(Printer p) {
        this.printer = p;
    }
    @Override
    public void print(String s) {
        printer.print(s);
    }
}
