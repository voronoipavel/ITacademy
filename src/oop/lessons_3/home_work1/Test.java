package oop.lessons_3.home_work1;
public class Test {

    public static void main(String [] args) {

        Courses coursesOne = new Courses();
        Courses coursesTwo = new Courses();
        Courses coursesThree = new Courses();

        Students studentsOne = new Students();
        Students studentsTwo = new Students();
        Students studentsThree = new Students();

        coursesOne.setName("Java");
        coursesTwo.setName("C#");
        coursesThree.setName("Python");

        coursesOne.setDate(2017, 11, 1);
        coursesTwo.setDate(2018, 10, 10);
        coursesThree.setDate(2018, 12, 18);

        coursesOne.setId(1);
        coursesTwo.setId(2);
        coursesThree.setId(3);

        studentsOne.setSurname("Ivanov");
        studentsOne.setName("Ivan");
        studentsOne.setGender("M");

        studentsTwo.setSurname("Tarasova");
        studentsTwo.setName("Polina");
        studentsTwo.setGender("F");

        studentsThree.setSurname("Sidorov");
        studentsThree.setName("Taras");
        studentsThree.setGender("M");

        studentsOne.setDate(1991, 5, 19);
        studentsTwo.setDate(1995, 2, 21);
        studentsThree.setDate(1989, 8, 12);

        System.out.println(coursesOne.getInfo());
        System.out.println(coursesTwo.getInfo());
        System.out.println(coursesThree.getInfo());

        System.out.println(studentsOne.getInfo());
        System.out.println(studentsTwo.getInfo());
        System.out.println(studentsThree.getInfo());

        //System.out.println(coursesOne.getDate());  //?

    }
}
