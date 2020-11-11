package com.company;

import java.util.ArrayList;

public class Picture extends Graphic{
    private ArrayList<Graphic> graphics = new ArrayList<Graphic>();

    @Override
    public void draw() {
        System.out.print("A picture, containing: [");
        for (Graphic graphic: graphics) {
            graphic.draw();
            System.out.print(", ");
        }
        System.out.println("]");
    }

    @Override
    public void add(Graphic g) {
        graphics.add(g);
    }

    @Override
    public void remove(Graphic g) {
        graphics.remove(g);
    }

    @Override
    public Graphic getChild(int index) {
        return graphics.get(index);
    }

    public ArrayList<Graphic> getGraphics() {
        return graphics;
    }
}
