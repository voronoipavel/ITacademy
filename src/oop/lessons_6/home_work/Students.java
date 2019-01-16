package oop.lessons_6.home_work;

import java.time.LocalDate;

public class Students {
    private String fullName;
    private LocalDate date;
    private String  citizenship;

    public Students() {
    }

    public Students(String fullName) {
        this.fullName = fullName;
    }

    public Students(String fullName, LocalDate date, String citizenship) {
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

