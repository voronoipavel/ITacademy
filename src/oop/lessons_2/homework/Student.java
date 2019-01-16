package oop.lessons_2.homework;

public class Student {
    String fullName;
    int age;
    int course;
    String gender;

    public static void main(String[] args) {

        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();

        studentOne.fullName = "Иванов Иван Иванович";
        studentOne.age = 18;
        studentOne.course = 1;
        studentOne.gender = "Мужской";

        studentTwo.fullName = "Сидоров Василий Петрович";
        studentTwo.age = 20;
        studentTwo.course = 3;
        studentTwo.gender = "Мужской";

        studentThree.fullName = "Иванова Валентина Ивановна";
        studentThree.age = 19;
        studentThree.course = 2;
        studentThree.gender = "Женский";

        info(studentOne.fullName, studentOne.age, studentOne.course, studentOne.gender);
        info(studentTwo.fullName, studentTwo.age, studentTwo.course, studentTwo.gender);
        info(studentThree.fullName, studentThree.age, studentThree.course, studentThree.gender);
    }
    static void info (String fullName,int age, int course, String gender){
        System.out.printf("Ф. И. О. - %s\nВозраст - %d\nКурс - %d\nПол - %s\n\n", fullName, age, course, gender);
    }
}
