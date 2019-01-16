package oop.lessons_11.finals;

import java.awt.*;

public class Circle {
    int x;
    int y;
    int radius;
    Color color;

    public Circle(int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

}