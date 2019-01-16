package oop.lessons_3;

public class Rectangle {

    double length;
    double width;
    double area;
    String color;
    String info;

    public Rectangle(){
        System.out.println("Конструктор запустился");
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Второй конструктор");
    }

    void setLength(double l){
        if (l <= 0){
            System.out.println("Error");
        }
        length = l;
    }
    void setWidth(double w){
        if (w <= 0){
            System.out.println("Error");
        }
        width = w;
    }
    void setSquare(double l){
        length = l;
        width = l;
    }
    void setWidthAndWidth(double l, double w){
        width = w;
        length = l;
    }
    void setColor (String c){
        color = c;
    }
    double getArea(){
        area = getLength() * getWidth();
        //area = length * width;
        return area;
    }
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    String getColor() {
        return color;
    }
    String getInfo(){
        info = getLength() + " " + getWidth() + " " + getArea() + " " + getColor();
        return info;
    }
}
