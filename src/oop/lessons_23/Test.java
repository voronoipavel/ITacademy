package oop.lessons_23;

import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Multiple> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Test test = new Test();

        test.addToMultiple(new Multiple(10, 10));
        test.addToMultiple(new Multiple(5, 3));
        test.addToMultiple(new Multiple(20, 5));
        test.addToMultiple(new Multiple(50, 2));
        System.out.println(test.arrayList.size());
    }

    public void addToMultiple(Multiple multiple) {
        boolean found = arrayList.contains(multiple);
        if (found) {
            System.out.println("Уже есть");
        } else arrayList.add(multiple);
    }
}
