package oop.lessons_17.home_Work;


public abstract class Animals implements CanSwim {

    private String name;
    private int weight;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
