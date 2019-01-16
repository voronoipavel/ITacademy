package oop.lessons_3.home_work1;

import java.time.LocalDate;

class Students {

    private String surname;
    private String name;
    private String gender;
    private String info;
    private LocalDate date;

    void setName(String isName) {
        name = isName;
    }

    private String getName() {
        return name;
    }

    void setSurname(String isSurname) {
        surname = isSurname;
    }

    private String getSurname() {
        return surname;
    }

    void setGender(String isGender) {
        gender = isGender;
    }

    private String getGender() {
        return gender;
    }

    void setDate(int year, int month, int dayOfMonth) {
        date = LocalDate.of(year, month, dayOfMonth);  //?
    }

    private LocalDate getDate() {
        return date;
    }

    String getInfo() {
        info = "Familia- " + getSurname() + " Name- " + getName() + " Gender " + getGender()
                + " date of birth- " + getDate();
        return info;
    }

}
