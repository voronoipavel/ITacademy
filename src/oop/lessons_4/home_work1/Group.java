package oop.lessons_4.home_work1;

import java.time.LocalDate;

public class Group {

    private Student students[];
    private Cours cours;
    private Teacher teacher;
    private int studentCount;
    private LocalDate date;
    private int durationInMonths;


    public Group(Student students[], Cours cours, Teacher teacher) {
        this.students = students;
        this.cours = cours;
        this.teacher = teacher;

    }

    public Group(Student students[], Cours cours, LocalDate date, int durationInMonths, Teacher teacher) {
        this.students = students;
        this.cours = cours;
        this.date = date;
        this.durationInMonths = durationInMonths;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Это группа по курсу: " + cours +
                ", преподаватель: " + teacher +
                ", в которой обучается: " + studentCount +
                " студент(а)-(ов)";
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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