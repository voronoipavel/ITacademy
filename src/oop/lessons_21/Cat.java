package oop.lessons_21;

import java.util.Objects;

public class Cat {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Cat{" +
                "Имя = " + name + ", Возраст = " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(age, cat.age) && Objects.equals(name, cat.name);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
