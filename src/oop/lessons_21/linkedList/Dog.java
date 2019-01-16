package oop.lessons_21.linkedList;

public class Dog extends Pet {


    @Override
    public String toString() {
        return "Dog{" +
                "Имя = " + super.getName() + ", Возраст = " + super.getAge() +
                '}';
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }
}

