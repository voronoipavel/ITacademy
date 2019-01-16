package oop.lessons_7.home_work1.people;

public class Person {

    private String fullName;
    private int age;

    public Person(){

    }

    @Override
    public String toString() {
        return "Меня зовут " + getFullName() +
                ", мне " + getAge() + " лет(года)";
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
