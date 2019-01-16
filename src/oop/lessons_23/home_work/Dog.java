package oop.lessons_23.home_work;

public class Dog {
    private String name;
    private int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Dog) {
            return this.name.equals(((Dog) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.weight + 5;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ", мой вес " + weight + " кг";
    }
}
