package oop.lessons_20.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(null);
        myArrayList.add(0, 10);

        System.out.println(myArrayList.indexOf(20));
        System.out.println(myArrayList.indexOf(10));

        for (Integer i : myArrayList) {
            System.out.println(i);
        }
    }
}
