package oop.lessons_14.homework;

public class Village extends InhabitedLocality {

    public Village(String head, String name) {
        super(head, name);
    }

    @Override
    public String toString() {
        return "Населенный пункт - " + super.name + ", Руководитель - " + super.head;
    }
}
