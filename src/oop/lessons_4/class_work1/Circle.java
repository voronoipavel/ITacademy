package oop.lessons_4.class_work1;

public class Circle {
    private boolean transparent = false;
    private String color;
    private int radius;
    private double square;
    private double length;

    public Circle (int radius){
        this.radius = radius;
        //System.out.println("Radius = " + radius);
    }
    public Circle (int radius, String color){
        //System.out.println("Radius = " + radius);
        //System.out.println("Color = " + color);
        this.radius = radius;
        this.color = color;
    }
    public Circle (int radius, String color, boolean transparent){
        //System.out.println("Radius = " + radius);
        //System.out.println("Color = " + color);
        //System.out.println("Transparent = " + transparent);
        this.radius = radius;
        this.color = color;
        this.transparent = transparent;
    }
    public boolean setTransporent() {
        return transparent;
    }
    public void setTransparent(boolean transparent){
        this.transparent = transparent;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double length(){
        length = 2 * 3.14 * radius;
        return length;
    }
    public double square(){
        square = 3.14 * radius * radius;
        return square;
    }
    void info(){
        System.out.println("Радиус = " + this.radius);
        System.out.println("Цвет = " + color);
        System.out.println("Прозрачен ли = " + transparent);
        System.out.println("Длина круга = " + length);
        System.out.println("Площадь круга = " + square);
    }
    public double increasedRadius(int n) {
        radius = n * radius;
        return radius;
    }
}
