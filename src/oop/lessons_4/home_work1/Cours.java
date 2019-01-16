package oop.lessons_4.home_work1;

import java.time.LocalDate;

public class Cours {
    private String name;
    private LocalDate date;
    private LocalDate expirationDate;
    private int durationInMonths;

    public Cours(String name, LocalDate date, int durationInMonths) {
        this.name = name;
        this.date = date;
        this.durationInMonths = durationInMonths;
    }

    @Override
    public String toString() {
        return "Это курс: " + name +
                ", дата начала: " + date +
                ", продолжительность курса в месяцах: " + durationInMonths +
                ", дата окончания курса: " + getExpirationDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getExpirationDate() {
        expirationDate = getDate().plusMonths(getDurationInMonths());
        return expirationDate;
    }
}