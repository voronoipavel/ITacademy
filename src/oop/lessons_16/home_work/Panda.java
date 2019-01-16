package oop.lessons_16.home_work;

public class Panda extends Animals {

    @Override
    public void climb() {
        System.out.println("Я панда и умею карабкаться");
    }

    @Override
    public void canKeepOnYourBack(Animals animals) {
        System.out.printf("Меня зовут %s могу держать на спине %s\n", getName(), animals.getName());
    }

    @Override
    public String getEat() {
        int length = Eat.PANDA.length;
        int index = (int) (Math.random()*length);
        return Eat.PANDA[index];
    }

    @Override
    public String toString() {
        return String.format("Панда ест %s", this.getEat());
    }
}