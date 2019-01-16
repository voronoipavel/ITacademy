package oop.lessons_24.classWork4;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();
        Cat c;

        for(int i = 0; i < 10; i++){
            c = new Cat();
            if(c.run(new Mouse())){
                cats.add(0, c);
            }
            else {cats.add(c);}
        }
        /*
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        */
        System.out.println((int)(Math.random()*2) == 0);
    }
}