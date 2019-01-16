package oop.lessons_21.linkedList;

public class Cat extends Pet {
    @Override
    public String toString() {
        return "Cat{" +
                "Имя = " + super.getName() + ", Возраст = " + super.getAge() +
                '}';
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }
}
