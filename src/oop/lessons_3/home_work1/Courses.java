package oop.lessons_3.home_work1;

import java.time.LocalDate;

class Courses {

    private String name;
    private LocalDate date;
    private String info;
    private int id;

    void setId(int id) {
        this.id = id;
    }
    private int getId() {
        return id;
    }
    void setName(String isName) {
        name = isName;
    }
    private String getName() {
        return name;
    }
    void setDate(int year, int month, int dayOfMonth) {
        date = LocalDate.of(year, month, dayOfMonth);
    }
    private LocalDate getDate() {
        return date;
    }
    String getInfo() {
        info = "Naming courses: " + getName() + " Date of creation: " + getDate() + " ID: " + getId();
        return info;
    }
}
