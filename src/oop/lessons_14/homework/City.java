package oop.lessons_14.homework;

public class City extends InhabitedLocality {
    String region;

    public City(String head, String name, String region) {
        super(head, name);
        this.region = region;
    }

    @Override
    public String toString() {
        return "Город - " + super.name + ", Руководитель - " + super.head + ", Область - " + this.region;
    }
}
