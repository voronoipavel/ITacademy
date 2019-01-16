package oop.lessons_13.task_15;

public class Circle {

    private int radius;
    final double pi = 3.14;
    static int count;
    static int count1;

    public Circle(int radius) {
        this.radius = radius;

    }

    public double payment(int radius) {

        double y = pi * Math.pow(radius, radius);

        if ((int)y % 3 == 0){
            count++;
        }
        return y;
    }

    public int getRadius() {
        return radius;
    }
}

