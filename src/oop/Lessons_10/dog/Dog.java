package oop.Lessons_10.dog;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private static int count;

    public Dog() {
        count++;
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }
}
