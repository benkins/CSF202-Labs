package com.company;

public class Circle extends Graphic{
    @Override
    public void draw() {
        System.out.print("A circle");
    }

    @Override
    public void add(Graphic g) { }

    @Override
    public void remove(Graphic g) { }

    @Override
    public Graphic getChild(int index) { return null; }
}
