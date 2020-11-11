package com.company;

public class Rectangle extends Graphic {

    @Override
    public void draw() {
        System.out.print("A rectangle");
    }

    @Override
    public void add(Graphic g) { }

    @Override
    public void remove(Graphic g) { }

    @Override
    public Graphic getChild(int index) { return null; }
}
