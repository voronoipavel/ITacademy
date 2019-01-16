package oop.lessons_16.classWork;

public class Turtle implements Turtable {
    public String name;
    @Override
    public void swim(){
        System.out.println("Turtle swims");
    }

    @Override
    public void egg(){
        System.out.println("Turtle egg");
    }
}