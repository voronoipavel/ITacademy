package oop.lessons_14.homework;

public abstract class InhabitedLocality {
    String head;
    String name;

    public InhabitedLocality(String head, String name) {
        this.head = head;
        this.name = name;
    }

    public void search(String s) {
        if (s.equalsIgnoreCase(this.head)) {
            System.out.println(toString());
        }
    }
}
