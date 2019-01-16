package oop.lessons_16.classWork;

public interface Swimmable {
    int deep = 11000;
    default void swim(){
        System.out.println("дефолтно плаваю");
    }
}
