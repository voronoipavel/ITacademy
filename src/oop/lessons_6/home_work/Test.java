package oop.lessons_6.home_work;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        Cours cours1 = new Cours("Python", LocalDate.of(2018, 9, 25), 9);
        Cours cours2 = new Cours("C++", LocalDate.of(2018, 9, 5), 6);
        Cours cours3 = new Cours("Java", LocalDate.of(2018, 9, 17), 10);
        System.out.println(cours1);
        System.out.println(cours2);
        System.out.println(cours3);

        Students students1 = new Students("Вороной Павел Владимирович",LocalDate.of(1986,9,4),"Кыргызское");

        Students studentsArray1[] = new Students[10];
        studentsArray1[0] = new Students("Иванов Иван Иванович");
        studentsArray1[1] = new Students("Тарасова Полина Тарасовна");
        studentsArray1[2] = new Students("Сидоров Тарас Тарасович", LocalDate.of(1992, 6, 19), "Российское");
        studentsArray1[3] = new Students("Петров Петр Петрович", LocalDate.of(1988, 11, 19), "Кыргызское");
        studentsArray1[4] = new Students("Тарасов Тарас Тарасович");
        studentsArray1[5] = students1;

        Students studentsArray2[] = new Students[10];
        studentsArray2[0] = new Students("Иванов Иван Иванович");
        studentsArray2[1] = new Students("Тарасова Полина Тарасовна");
        studentsArray2[2] = new Students("Сидоров Тарас Тарасович", LocalDate.of(1992, 6, 19), "Российское");
        studentsArray2[3] = students1;

        Group group1 = new Group(studentsArray1, cours1, cours1.getDate(), cours1.getDurationInMonths());
        Group group2 = new Group(studentsArray2, cours3);

        System.out.println("------------------------------");
        System.out.println("Количество студентов = " + group1.getStudentCount());
        System.out.println("Количество студентов = " + group2.getStudentCount());
        System.out.println("------------------------------");
        for (int i = 0; i < studentsArray1.length; i++) {
            if (studentsArray1[i] != null)
                System.out.println(studentsArray1[i]);
        }

        Lessons lessons1 = new Lessons(LocalDate.of(2018,11,10), studentsArray1,cours1, LocalTime.of(19,0),true,false);
        Lessons lessons2 = new Lessons(LocalDate.of(2018,11,11), studentsArray2,cours1, LocalTime.of(19,0),true,true);

        System.out.println("------------------------------");
        System.out.println(group1);
        System.out.println(group2);
        System.out.println("------------------------------");
        System.out.println(group1.getCours());
        System.out.println("------------------------------");
        System.out.println(lessons1);
        System.out.println(lessons2);
    }
}