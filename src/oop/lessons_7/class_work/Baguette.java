package oop.lessons_7.class_work;

public class Baguette extends Bread {
    double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    void scar(){
        System.out.println("Я зарубцован");
    }
    @Override
    void pack(){
        System.out.println("Упакован в экологичный пакет");
    }
}
