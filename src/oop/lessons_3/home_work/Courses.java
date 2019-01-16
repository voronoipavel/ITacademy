package oop.lessons_3.home_work;

public class Courses {
    String name;
    String date;
    String info;
    int id;

    void setName (String isName){
        getId();
        name = isName;
    }
    void setDate (String isDate){
        date = isDate;
    }
    int getId() {    // Хотел сделать счетчик но он начинается заново как это исправить???
        id = id + 1; // Эту строку пробовал ставить и в setName результат один
        return id;
    }
    String getName(){
        return name;
    }
    String getDate(){
        return date;
    }
    String getInfo (){
        info = "Наименование курса: " + getName() + ". Дата создания: " + getDate() + " ID: " + getId();
        return info;
    }
}