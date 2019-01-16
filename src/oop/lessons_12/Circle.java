package oop.lessons_12;

import java.awt.*;

public class Circle extends Figure{

    private int radius;
    static int count;



    public Circle(LocationOfFigure location){
        super(location);
    }

    public Circle(LocationOfFigure location, int radius){
        super(location);
        this.radius = radius;
        count++;
    }

    public Circle(LocationOfFigure location, Color color, int radius) {
        super(location, color);
        this.radius = radius;
        count++;
    }

    public int getRadius() {
        return radius;
    }

}
