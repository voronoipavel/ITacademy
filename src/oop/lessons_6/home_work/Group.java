package oop.lessons_6.home_work;

import java.time.LocalDate;

public class Group {

    private Students students[];
    private Cours cours;
    private int studentCount;
    private LocalDate date;
    private int durationInMonths;


    public Group(Students students[], Cours cours) {
        this.students = students;
        this.cours = cours;
    }

    public Group(Students students[], Cours cours, LocalDate date, int durationInMonths) {
        this.students = students;
        this.cours = cours;
        this.date = date;
        this.durationInMonths = durationInMonths;
    }

    @Override
    public String toString() {
        return "Это группа по курсу: " + cours +
                ", в которой обучается: " + studentCount +
                " студент(а)-(ов)";
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public int getStudentCount() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                this.studentCount++;
            }
        }
        return this.studentCount;
    }
}