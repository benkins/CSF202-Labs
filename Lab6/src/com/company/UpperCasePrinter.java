package com.company;

import sun.tools.jconsole.JConsole;

public class UpperCasePrinter extends PrinterDecorator {

    public UpperCasePrinter(Printer p) {
        super(p);
    }

    @Override
    public void print(String s){
        super.print(s.toUpperCase());
    }
}
