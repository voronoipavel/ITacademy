package oop.lessons_22.classWork;

public enum Days {
    MON("ПН"), TUE("ВТ"), WED("СР"), THU("ЧТ"), FRI("ПТ"), SAT("СБ"), SUN("ВС");

    String title;
    Days(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
