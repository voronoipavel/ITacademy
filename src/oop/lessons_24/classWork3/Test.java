package oop.lessons_24.classWork3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    static List<Person> persons = new ArrayList<>();
    static Set<Person> doubled = new HashSet<>();
    public static void main(String[] args) {
        Person p;
        for (int i = 0; i < 100; i += 2) {
            p = new Person("Человек" + i, i);
            persons.add(p);
        }
        for (int i = 0; i < 100; i += 3) {
            p = new Person("Человек" + i, i);
            if (!persons.contains(p)) {
                persons.add(p);
            } else {
                doubled.add(p);
            }
        }
        for (Person per: persons) {
            System.out.println(per);
        }
        System.out.println("***********************");
        for (Person per: doubled) {
            System.out.println(per);
        }
    }
}
