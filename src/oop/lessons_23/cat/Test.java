package oop.lessons_23.cat;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat(100,"1"));
        cats.add(new Cat(100,"2"));
        cats.add(new Cat(10,"3"));
        cats.add(new Cat(100,"4"));
        cats.add(new Cat(100,"7"));
        cats.add(new Cat(10,"4"));

        System.out.println(cats.size());

        for (Cat c: cats) {
            System.out.println(c);

        }
    }
}
