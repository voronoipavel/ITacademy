package oop.lessons_21;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cat> myCat = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCat.add(new Cat("Кошка" + String.valueOf(i + 1), i + 1));
        }
        int position = myCat.indexOf(new Cat("Кошка" + 6, 6));

        System.out.println(position == -1 ? "Не найдено" : "Найдено по индексу " + position);

        /*
        for (Cat c : myCat) {
            System.out.println(c);
        }
        */
        Cat[] cat = myCat.toArray(new Cat[2]);

        for (Cat c : cat) {
            System.out.println(c);

        }
    }
}