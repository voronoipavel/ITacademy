package oop.lessons_17.home_Work;

public class Shark extends Animals {

    public Shark(String name) {
        super(name);
        setWeight((int) (Math.random() * 800 + 200));
    }

    @Override
    public String swim() {
        return "Я плаваю как акула";
    }

    @Override
    public String speak() {
        return "Я говорю как акула";
    }
}
