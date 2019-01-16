package oop.lessons_22.home_work;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int lengthList = 100;
        int[] array = new int[lengthList];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < lengthList; i++) {
            array[i] = (int) (Math.random() * 2);
            arrayList.add((int) (Math.random() * 2));
            linkedList.add((int) (Math.random() * 2));
        }
        System.out.print("Массив: ");
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Array list: ");
        for (int i : arrayList) {

            System.out.print(i);
        }
        System.out.println();
        System.out.print("Linked list: ");
        for (Object o : linkedList) {
            System.out.print(o);
        }
        sort(array);
        sort(arrayList);
        sort(linkedList);
    }

    public static void sort(int array[]) {
        int x = 0, y = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[x] = array[i];
                x++;
            } else {
                array[array.length - (y + 1)] = array[i];
                y++;
            }
        }
        System.out.println();
        System.out.print("Массив: ");
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void sort(ArrayList list) {

        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                arrayList.add(0, list.get(i));

            } else {
                arrayList.add(list.get(i));
            }
        }
        System.out.println();
        System.out.print("Array list: ");
        for (Object o : arrayList) {
            System.out.print(o);
        }
    }

    public static void sort(LinkedList list) {

        LinkedList linkedList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                linkedList.add(0, list.get(i));

            } else {
                linkedList.add(list.get(i));
            }
        }
        System.out.println();
        System.out.print("Linked list: ");
        for (Object o : linkedList) {
            System.out.print(o);
        }
    }
}