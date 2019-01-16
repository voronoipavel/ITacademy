package oop.lessons_3.home_work;

public class Test {
    public static void main(String[] args) {
        Courses coursesOne = new Courses();
        Courses coursesTwo = new Courses();
        Courses coursesThree = new Courses();
        Students studentsOne = new Students();
        Students studentsTwo = new Students();
        Students studentsTree = new Students();
        coursesOne.setName("Java");
        coursesTwo.setName("C++");
        coursesThree.setName("Python");
        studentsOne.setSurname("Иванов");
        studentsOne.setName("Иван");
        studentsOne.setGender("Мужской");
        studentsTwo.setSurname("Тарасова");
        studentsTwo.setName("Полина");
        studentsTwo.setGender("Женский");
        studentsTree.setSurname("Сидоров");
        studentsTree.setName("Тарас");
        studentsTree.setGender("Мужской");
        studentsOne.setDate(1991,5,19);
        studentsTwo.setDate(1995,2,28);
        studentsTree.setDate(1998,12,31);
        System.out.println(coursesOne.getInfo());
        System.out.println(coursesTwo.getInfo());
        System.out.println(coursesThree.getInfo());
        System.out.println(studentsOne.getInfo());
        System.out.println(studentsTwo.getInfo());
        System.out.println(studentsTree.getInfo());
        System.out.println(studentsOne.getDate());
    }
}
