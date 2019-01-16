package oop.lessons_4.home_work1;

public class Person {

    private String fullName;
    private int age;

    @Override
    public String toString() {
        return "Меня зовут " + fullName +
                ", мне " + age + " лет(года)";
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
