package oop.lessons_11;

import java.util.Random;

public class Final {
    public final double CONST = 3.14;

    public static void main(String[] args) {

        Random random = new Random();
        final int array [] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
    }
}
class Parent {
    public int a = 3;

}
