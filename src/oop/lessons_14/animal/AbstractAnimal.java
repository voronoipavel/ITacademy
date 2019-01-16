package oop.lessons_14.animal;

public abstract class AbstractAnimal {
    private int weight;
    private int age;
    private String color;

    String name;
    abstract void makeNoise();
    abstract void eat();
    abstract void run();
    abstract void sleep();

    void live(){
        System.out.println(getName());
        makeNoise();
        sleep();
        eat();
        run();
    }

    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
