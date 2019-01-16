package oop.lessons_3.home_work;

import java.time.LocalDate;

public class Students {
    String surname;
    String name;
    String gender;
    String info;
    LocalDate date;

    void setSurname (String isSurname){
        surname = isSurname;
    }
    void setName (String isName){
        name = isName;
    }
    void setGender (String isGender){
        gender = isGender;
    }
    void setDate (int year, int month, int dayOfMonth){
        date = LocalDate.of(year, month, dayOfMonth);  // по другому я не смог придумать, но я думаю это не совсем правельно
    }
    LocalDate getDate(){
        return date;
    }
    String getSurname(){
        return surname;
    }
    String getName(){
        return name;
    }
    String getGender(){
        return gender;
    }
    String getInfo(){
        info = "Фамилия - " + getSurname() + " Имя - " + getName() + " Пол - " + getGender() + " Дата рождения - " + getDate();
        return info;
    }
}