package oop.lessons_14.animal;

public abstract class AbstractFelidae extends AbstractAnimal {
    private int numOfClaws;
    private int tailLength;
    private int numberOfWhiskers;


    abstract void eat();

    abstract void sleep();

    @Override
    void live() {
        System.out.println(getName());
        makeNoise();
        sleep();
        eat();
        run();
        purr();
        sharpenClaws();
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу-Мяу");
    }

    @Override
    void run() {
        System.out.println("Тип Топ");
    }

    void purr() {
        System.out.println("Мур");
    }

    void sharpenClaws(){

    }
}
