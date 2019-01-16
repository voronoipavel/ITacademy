package oop.lessons_7.class_work;

public class Lavash extends Bread {

    void fold(){
        System.out.println("Я лаваш, меня завернули");
    }

    @Override
    void bake(){
        System.out.println("Я лаваш, меня испекли");

    }
}
