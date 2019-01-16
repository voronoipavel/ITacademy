package oop.lessons_16.home_work;

public abstract class Animals implements CanСlimb, Eatable, Eat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void canKeepOnYourBack(Animals animals);

}
