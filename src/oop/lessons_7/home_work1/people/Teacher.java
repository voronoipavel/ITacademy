package oop.lessons_7.home_work1.people;

public class Teacher extends Person {
    String programmingLanguages;



    @Override
    public String toString() {
        return "Меня зовут " + getFullName() +
                ", мне " + getAge() + " лет(года)" +
                ", язык программирования: " + getProgrammingLanguages();
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}