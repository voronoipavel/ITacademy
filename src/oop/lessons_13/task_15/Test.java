package oop.lessons_13.task_15;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Circle circle = new Circle(i);
            circle.payment(circle.getRadius());
        }
        System.out.println(Circle.count);
    }
}

