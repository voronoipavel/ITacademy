package oop.lessons_5.class_work;

public class Hdd {
    private int speed;
    private int size;

    public Hdd(int speed, int size){
        this.speed = speed;
        this.size = size;
        System.out.print(" Speed hdd = " + getSize() + " Obem hdd = " + getSize());
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "speed = " + speed +
                ", size = " + size +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
