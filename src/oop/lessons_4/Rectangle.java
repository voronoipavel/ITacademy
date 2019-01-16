package oop.lessons_4;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        System.out.println("Конструктор запустился");
    }
    public Rectangle(double length, double width){
        this.setLength(length);
        this.setWidth(width);
        System.out.println("Второй конструктор");
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
