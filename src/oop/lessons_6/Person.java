package oop.lessons_6;

public class Person extends Object {

    private int age;
    private String address;
    private String fullName;

    public Person(int age, String address, String fullName) {
        this.age = age;
        this.address = address;
        this.fullName = fullName;
    }
    @Override
    public String toString(){
        return "Возраст " + age + " Адресс " + address + " Имя " + fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

