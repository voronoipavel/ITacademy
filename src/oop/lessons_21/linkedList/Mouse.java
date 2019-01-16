package oop.lessons_21.linkedList;

public class Mouse extends Pet {
    @Override
    public String toString() {
        return "Mouse{" +
                "Имя = " + super.getName() + ", Возраст = " + super.getAge() +
                '}';
    }

    public Mouse(String name, Integer age) {
        super(name, age);
    }
}

