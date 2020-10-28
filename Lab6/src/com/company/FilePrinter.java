package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer{

    private File file;

    public FilePrinter(String filename){
        this.createFile(filename);
    }

    @Override
    public void print(String s) {
        try {
            FileWriter myWriter = new FileWriter(this.file.getName());
            myWriter.write(s);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void createFile(String fileName){
        try {
            File myObj = new File(fileName +".txt");
            if (myObj.createNewFile()) {
                this.file= myObj;
            } else {
                this.file = myObj;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
