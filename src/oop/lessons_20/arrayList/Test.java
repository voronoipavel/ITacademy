package oop.lessons_20.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Long> myArrayList = new ArrayList<>();
        List<Long> myArrayList1 = new ArrayList<>();

        for (long i = 0; i <= 100000; i++) {
            if (i % Math.sqrt(i) == 0) {
                myArrayList.add(i);
            }
        }
        for (long i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get((int)i) % 2 == 0 && myArrayList.get((int) i) % 3 == 0){
               // myArrayList1.add(myArrayList.indexOf(Integer.valueOf(i)));
            }

        }

        for (Long i : myArrayList) {
            System.out.println(i);
        }

        for (Long i : myArrayList1) {
            System.out.println(i);
        }

    }

}
