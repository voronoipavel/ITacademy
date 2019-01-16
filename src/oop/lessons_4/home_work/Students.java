package oop.lessons_4.home_work;

import java.time.LocalDate;

public class Students {
    String fullName;
    private LocalDate date;
    String citizenship;

    public Students(String fullName) {
        this.fullName = fullName;
    }

    public Students(String fullName, LocalDate date, String citizenship) {
        this.fullName = fullName;
        this.date = date;
        this.citizenship = citizenship;
    }

}