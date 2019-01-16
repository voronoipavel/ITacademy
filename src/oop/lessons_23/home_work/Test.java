package oop.lessons_23.home_work;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Dog> dalmatians = new HashSet<>();

        int count = 1;
        while (dalmatians.size() < 40) {
            Dog dog = new Dog("Долматинец № " + ((int) (Math.random() * 40 + 1)), (int) (Math.random() * 4 + 5));
            count++;
            if (!(dalmatians.contains(dog))) {
                dalmatians.add(dog);
            }
        }
        for (Dog d : dalmatians) {
            System.out.println(d);
        }

        System.out.println("Всего создано Долматинцев: " + count);
        System.out.println("Добавлено в множество: " + dalmatians.size());
    }
}
