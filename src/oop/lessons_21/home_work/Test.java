package oop.lessons_21.home_work;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Cat> arrayList = new ArrayList<>();
        List<Cat> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(new Cat("Cat № " + (i + 1)));
            linkedList.add(new Cat("Cat № " + (i + 1)));
        }
        int quantity = 500;
        System.out.println("Статистика");
        System.out.println("Добавление кошек в середину списков ");
        long addArrayList = addListMiddle(arrayList, quantity);
        long addLinkedList = addListMiddle(linkedList, quantity);
        System.out.println("ArrayList = " + addArrayList);
        System.out.println("LinkedList = " + addLinkedList);

        System.out.println("Добавление в начало и конец");
        long addStartArrayList = addListStartEnd(arrayList, quantity);
        long addStartLinkedList = addListStartEnd(linkedList, quantity);
        System.out.println("ArrayList = " + addStartArrayList);
        System.out.println("LinkedList = " + addStartLinkedList);

        System.out.println("Удаление с середины и с начало");
        long removeArrayList = removeList(arrayList, quantity);
        long removeLinkedList = removeList(linkedList, quantity);
        System.out.println("ArrayList = " + removeArrayList);
        System.out.println("LinkedList = " + removeLinkedList);

        System.out.println("Считывание с середины и с конца");
        long getArrayList = getList(arrayList, quantity);
        long getLinkedList = getList(linkedList, quantity);
        System.out.println("ArrayList = " + getArrayList);
        System.out.println("LinkedList = " + getLinkedList);

        System.out.println("Перезаписывание с середины и с начало");
        long setArrayList = setList(arrayList, quantity);
        long setLinkedList = setList(linkedList, quantity);
        System.out.println("ArrayList = " + setArrayList);
        System.out.println("LinkedList = " + setLinkedList);

        long timeArrayList = addArrayList + addStartArrayList + removeArrayList + getArrayList + setArrayList;
        long timelinkedList = addLinkedList + addStartLinkedList + removeLinkedList + getLinkedList + setLinkedList;
        System.out.println("Вывод");
        System.out.println("Общее время");
        System.out.println("ArrayList = " + timeArrayList);
        System.out.println("LinkedList = " + timelinkedList);
    }

    public static long addListStartEnd(List list, int quantity) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            list.add(0, new Cat("Cat № " + (i + 1)));
            list.add(new Cat("Cat № " + (i + 1)));
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        return timeSpent;
    }

    public static long addListMiddle(List list, int quantity) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            if (list instanceof ArrayList) {
                list.add(list.size() / 2 + i, new Cat("Cat № " + (i + 1)));
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        return timeSpent;
    }

    public static long removeList(List list, int quantity) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            list.remove(0);
            list.remove(list.size() - 1);
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        return timeSpent;
    }

    public static long getList(List list, int quantity) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            list.get(list.size() / 2 + i);
            list.get(list.size() -1);
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        return timeSpent;
    }

    public static long setList(List list, int quantity) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            list.set(0, new Cat("Cat № " + (i + 1)));
            list.set(list.size() / 2 + i, new Cat("Cat № " + (i + 1)));
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        return timeSpent;
    }
}