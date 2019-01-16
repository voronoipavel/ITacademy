package oop.lessons_17.animals;

public class Shark extends Animal {
    private int weight;

    public Shark() {
        this.weight = ((int) (Math.random() * 800) + 200);
    }

    @Override
    public void makeSounds (){
        System.out.println("Я акула");
    }

    @Override
    public void swim(){
        System.out.println();
    }
    public void hunt(){
        System.out.println("охотиться");
    }

    public int getWeight() {
        return weight;
    }
}
