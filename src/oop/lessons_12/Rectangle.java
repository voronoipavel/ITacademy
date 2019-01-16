package oop.lessons_12;

import java.awt.*;

public final class Rectangle extends Figure {

    private int height;
    private int width;
    static int count;



    public Rectangle(LocationOfFigure location, int height, int width) {
        super(location);
        this.height = height;
        this.width = width;
        count++;
    }

    public Rectangle(LocationOfFigure location, int height) {
        super(location);
        this.height = height;
        this.width = height;
        count++;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String speak(){
        return (height == width && height != 0) ? "Я квадрат со стороной = " + height  : "Я прямоугольник с высотой = " + height + ", и шириной = " + width;
    }
}
