package oop.lessons_7.home_work1.people;

import java.time.LocalDate;

public class Student extends Person {

    private LocalDate date;
    private String citizenship;

    public Student(String fullName) {

        super(fullName);
    }
    public Student(){

    }

    public Student(String fullName, LocalDate date, String citizenship) {
        super(fullName);
        this.date = date;
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Я студент: " + getFullName() + ", родился: " + getDate() + ", гражданство: " + getCitizenship();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}