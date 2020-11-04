package com.company;

public class ReversePrinter extends PrinterDecorator {
    public ReversePrinter(Printer p) {
        super(p);
    }
    @Override
    public void print(String s){
        byte[] strAsByteArray = s.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        super.print(new String(result));
    }
}
