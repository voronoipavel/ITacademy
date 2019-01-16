package oop.lessons_17.animals;

public class Turtle extends Animal{
    private int weight;

    public Turtle() {
        this.weight = (int) (Math.random() * 3) + 1;
    }

    @Override
    public void makeSounds (){
        System.out.println("Я черепаха");
    }
    @Override
    public void swim(){
        System.out.println();
    }

    public int weight(){
        return weight;
    }

}
