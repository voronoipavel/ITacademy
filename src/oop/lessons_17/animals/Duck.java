package oop.lessons_17.animals;

public class Duck extends Animal{
    private int weight;

    public Duck() {
        this.weight = ((int) (Math.random() * 5) + 1);
    }

    @Override
    public void makeSounds (){
        System.out.println("Я утка");
    }

    @Override
    public void swim(){
        System.out.println();
    }

    public int getWeight(){
        return weight;
    }
}
