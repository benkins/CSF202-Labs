package com.company;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
    	LineNumberPrinter lineNumberPrinter = new LineNumberPrinter(new ConsolePrinter());
    	lineNumberPrinter.print("This is a line number printer");
    	lineNumberPrinter.print("It shows you the number of the line that its printing");
    	lineNumberPrinter.print("It is such a cool program");

		FilePrinter filePrinter = new FilePrinter("Test");
		filePrinter.createFile("test");
		filePrinter.print("Hello there!");

		LineWrappingPrinter lineWrappingPrinter = new LineWrappingPrinter(new FilePrinter("test123"), 5);
    	lineWrappingPrinter.print("Tom's labs are the best");

    	ReversePrinter reversePrinter = new ReversePrinter(new ConsolePrinter());
    	reversePrinter.print("My name is jeff");
    }
}
