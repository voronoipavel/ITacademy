package oop.lessons_6.home_work;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Lessons {
    private LocalDate date;
    private Students students[];
    private Cours cours;
    private LocalTime time;
    private boolean homeWork;
    private boolean exam;

    public Lessons(LocalDate date, Students students[], Cours cours, LocalTime time, boolean homeWork, boolean exam) {
        this.date = date;
        this.students = students;
        this.cours = cours;
        this.time = time;
        this.homeWork = homeWork;
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Дата проведения: " + date +
                ", Присутствующие студенты: " + Arrays.toString(students) +
                ", Курс: " + cours +
                ", время начала: " + time +
                ", была ли домашка: " + homeWork +
                ", был ли экзамен: " + exam;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Students getStudents()[] {
        return students;
    }

    public void setStudents(Students students[]) {
        this.students = students;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setStartTime(LocalTime time) {
        this.time = time;
    }

    public boolean isHomeWork() {
        return homeWork;
    }

    public void setHomeWork(boolean homeWork) {
        this.homeWork = homeWork;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }

}
