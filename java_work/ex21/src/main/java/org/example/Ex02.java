package org.example;

public class Ex02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1.getXpos(),p1.getYpos());

        p1.showPoint();
        p2.showPoint();

        p1.setYpos(30);
        p1.setXpos(40);

        p1.showPoint();
        p2.showPoint();

    }
}
