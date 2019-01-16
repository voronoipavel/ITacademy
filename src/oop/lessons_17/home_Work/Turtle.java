package oop.lessons_17.home_Work;

public class Turtle extends Animals {

    public Turtle(String name) {
        super(name);
        setWeight((int) (Math.random() * 3 + 1));
    }

    @Override
    public String swim() {
        return "Я плаваю как черепаха";
    }

    @Override
    public String speak() {
        return "Я говорю как черепаха";
    }
}
