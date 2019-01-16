package oop.lessons_17.home_Work;

public class Duck extends Animals {

    public Duck(String name) {
        super(name);
        setWeight((int) (Math.random() * 5 + 1));
    }

    @Override
    public String swim() {
        return "Я плаваю как утка";
    }

    @Override
    public String speak() {
        return "Я говорю как утка";
    }

}
