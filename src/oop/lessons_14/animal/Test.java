package oop.lessons_14.animal;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Cat");
        Tiger tiger = new Tiger();


        tiger.live();
        System.out.println("-------------------------------");
        cat.live();


    }
}
