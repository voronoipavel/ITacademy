package oop.lessons_23.cat;

import java.util.Objects;

public class Cat {
    int id;
    String name;

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            return ((Cat) o).name.equals(this.name)&& ((Cat) o).id == this.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id * 133;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
