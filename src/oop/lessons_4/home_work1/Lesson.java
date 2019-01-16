package oop.lessons_4.home_work1;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Lesson {
    private LocalDateTime dateTime;
    private Student students[];
    private Cours cours;
    private Teacher teacher;
    private boolean homeWork;
    private boolean exam;

    public Lesson(LocalDateTime dateTime, Student students[], Cours cours, Teacher teacher, boolean homeWork, boolean exam) {
        this.dateTime = dateTime;
        this.students = students;
        this.cours = cours;
        this.teacher = teacher;
        this.homeWork = homeWork;
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Дата и время проведения: " + dateTime +
                ", Присутствующие студенты: " + Arrays.toString(students) +
                ", Курс: " + cours +
                ", преподаватель: " + teacher +
                ", была ли домашка: " + homeWork +
                ", был ли экзамен: " + exam;
    }

    public LocalDateTime getDate() {
        return dateTime;
    }

    public void setDate(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Student getStudents()[] {
        return students;
    }

    public void setStudents(Student students[]) {
        this.students = students;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
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
