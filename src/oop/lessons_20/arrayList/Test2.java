package oop.lessons_20.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {


        List<Integer> myArrayList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArrayList.add(i);
            } else myArrayList.add(0, i);
        }

//        for (int i = 0; i < myArrayList.size();) {
//            if (myArrayList.get(i) % 2 == 0){
//                myArrayList.remove(i);
//            }else i++;
//
//        }
        Integer[] integers = myArrayList.toArray(new Integer[myArrayList.size()]);

        //ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.asList(integers);


        for (Integer i : myArrayList) {
            System.out.println(i);
        }

        /*
        for (Integer i : integers) {
            System.out.println(i);
        }
        */
    }

}
