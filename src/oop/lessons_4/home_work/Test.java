package oop.lessons_4.home_work;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Students studentsOne = new Students("Ivanov Ivan Ivanovich", LocalDate.of(1990, 9, 9),"aaaa");
        Students studentsTwo = new Students("Ivanov1", LocalDate.of(1994,9,11), "Ivanovich");
        Students studentsTree = new Students("Ivanov2", LocalDate.of(1984,3,21), "Ivanovich");

        Group group = new Group();
        group.getStudents("fff");
        System.out.println(group.getStudents("fff"));



    }
}
