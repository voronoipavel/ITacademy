package oop.lessons_7.home_work1;



import oop.lessons_7.home_work1.people.*;
import oop.lessons_7.home_work1.training.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {

        Cours cours1 = new Cours("Python", LocalDate.of(2018, 9, 25), 9);
        Cours cours2 = new Cours("C++", LocalDate.of(2018, 9, 5), 6);
        Cours cours3 = new Cours("Java", LocalDate.of(2018, 9, 17), 10);
        System.out.println(cours1);
        System.out.println(cours2);
        System.out.println(cours3);

        Teacher teacher = new Teacher();
        teacher.setFullName("Касымов Алишер");
        teacher.setAge(34);
        teacher.setProgrammingLanguages("Java");

        Person person = new Person();
        person.setFullName("Qwerty");

        Student student1 = new Student("Вороной Павел Владимирович",LocalDate.of(1986,9,4),"Кыргызское");

        Student studentArray1[] = new Student[10];
        studentArray1[0] = new Student("Иванов Иван Иванович");
        studentArray1[1] = new Student("Тарасова Полина Тарасовна");
        studentArray1[2] = new Student("Сидоров Тарас Тарасович", LocalDate.of(1992, 6, 19), "Российское");
        studentArray1[3] = new Student("Петров Петр Петрович", LocalDate.of(1988, 11, 19), "Кыргызское");
        studentArray1[4] = new Student("Тарасов Тарас Тарасович");
        studentArray1[5] = student1;

        Student studentArray2[] = new Student[10];
        studentArray2[0] = new Student("Иванов Иван Иванович");
        studentArray2[1] = new Student("Тарасова Полина Тарасовна");
        studentArray2[2] = new Student("Сидоров Тарас Тарасович", LocalDate.of(1992, 6, 19), "Российское");
        studentArray2[3] = student1;

        Group group1 = new Group(studentArray1, cours1, cours1.getDate(), cours1.getDurationInMonths(), teacher);
        Group group2 = new Group(studentArray2, cours3, teacher);

        System.out.println("------------------------------");
        System.out.println("Количество студентов = " + group1.getStudentCount());
        System.out.println("Количество студентов = " + group2.getStudentCount());
        System.out.println("------------------------------");
        for (int i = 0; i < studentArray1.length; i++) {
            if (studentArray1[i] != null)
            System.out.println(studentArray1[i]);
        }

        Lesson lesson1 = new Lesson(LocalDateTime.of(2018,11,10,19,0), studentArray1,cours1, teacher,true,false);
        Lesson lesson2 = new Lesson(LocalDateTime.of(2018,11,11,18,0), studentArray2,cours1, teacher,false,true);

        System.out.println("------------------------------");
        System.out.println(group1.toString());
        System.out.println(group2.toString());
        System.out.println("------------------------------");
        System.out.println(group1.getCours());
        System.out.println("------------------------------");
        System.out.println(lesson1);
        System.out.println(lesson2);

    }

}