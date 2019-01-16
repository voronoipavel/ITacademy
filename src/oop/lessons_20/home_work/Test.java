package oop.lessons_20.home_work;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        ArrayList<String> myArrayList = new ArrayList<>();

        myList.add("Ветер с моря дул");
        myList.add("Нагонял беду");
        myList.add("И сказал ты мне");
        myList.add("Больше не приду");

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() > 13) {
                myArrayList.add(myList.get(i));
            }
            myList.add(i, myList.get(i));
            i++;
        }
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).equalsIgnoreCase("и сказал ты мне")) {
                myArrayList.remove(i);
                i--;
            }
        }

        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (String s : myArrayList) {
            System.out.println(s);
        }
    }
}