package oop.lessons_7.class_work;

public class Lepeshka extends  Bread{
    double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void print(){
        System.out.println("Нанесли узоры");
    }
    void varnish(){
        System.out.println("Нанесли лак");
    }

}
