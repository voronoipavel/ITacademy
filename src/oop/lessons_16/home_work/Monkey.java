package oop.lessons_16.home_work;

public class Monkey extends Animals{

    @Override
    public void climb() {
        System.out.println("Я обезьяна и умею карабкаться");
    }

    @Override
    public void canKeepOnYourBack(Animals animals) {
        System.out.printf("Меня зовут %s могу держать на спине %s\n", getName(), animals.getName());
    }

    @Override
    public String getEat() {
        int length = Eat.MONKEY.length;
        int index = (int) (Math.random() * length);
        return Eat.MONKEY[index];
    }

    @Override
    public String toString() {
        return String.format("Обезьяна ест %s", this.getEat());
    }
}
