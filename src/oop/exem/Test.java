package oop.exem;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 2 == 0) {
                hashSet.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                hashSet.add(array[i]);
            }
        }
        for (Integer i : hashSet) {
            System.out.println(i);

        }
    }
}
