package oop.exem.exem2;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    String middleName;

    public Person(String surname,String name, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public void walk(Person p) throws Exception {
        if (p.equals(name)){
            throw new Exception();
        }else System.out.println();

    }

    public boolean equals(Person o) throws IndexOutOfBoundsException {
        Person person = (Person) o;
        if (Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(middleName, person.middleName)) {
            throw new IndexOutOfBoundsException();
        }
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(middleName, person.middleName);
    }
}
