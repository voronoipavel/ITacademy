package oop.lessons_23.set;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        int a = 1;
        for (int i = 0; i < 400; i++) {
            if (a < 100) {
                integers.add(a);
                a++;
            } else a = 1;
        }

        for (Integer i: integers) {
            System.out.println(i);

        }
    }
}
