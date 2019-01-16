package oop.lessons_4.home_work;

public class Group {
    private int numberOfStudents;
    private Students[] students = new Students[getNumberOfStudents()];
    private String date;
    private int durationInMonths;


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Students[] getStudents(String fff) {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }
}
