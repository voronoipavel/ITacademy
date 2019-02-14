package oop.lessons_12;

import java.awt.*;

public abstract class Figure {
    private LocationOfFigure location;
    private Color color;
    private boolean visible;

    public Figure(LocationOfFigure location, Color color, boolean visible) {
        this.location = location;
        this.color = color;
        this.visible = visible;
    }

    public Figure(LocationOfFigure location) {
        this.location = location;
    }

    public Figure(LocationOfFigure location, Color color) {
        this.location = location;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean isVisible() {
        return visible;
    }

    public LocationOfFigure getLocation() {
        return location;
    }

    public String speak(){
        return "Я фигура = " + color + ", видна = " + visible;
    }
}
