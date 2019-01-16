package oop.Lessons_10.dog;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Dog", 10,5);
        System.out.println(Dog.getCount());
    }
}
