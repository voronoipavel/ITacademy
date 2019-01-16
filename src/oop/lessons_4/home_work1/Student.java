package oop.lessons_4.home_work1;

import java.time.LocalDate;

class Student extends Person {

    private String fullName;
    private LocalDate date;
    private String  citizenship;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student(String fullName, LocalDate date, String citizenship) {
        this.fullName = fullName;
        this.date = date;
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Я студент: " + fullName + ", родился: " + date + ", гражданство: " + citizenship;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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