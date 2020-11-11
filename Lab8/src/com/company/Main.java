package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Circle circle1 = new Circle();
        Line line1 = new Line();
        Picture picture1 = new Picture();

        picture1.add(rectangle1);
        picture1.add(circle1);
        picture1.add(line1);

        Circle circle2 = new Circle();
        Circle circle3 = new Circle();


        Picture picture2 = new Picture();
        picture2.add(circle2);
        picture2.add(circle3);

        picture1.add(picture2);

        picture1.draw();
    }
}
