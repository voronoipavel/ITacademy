package oop.lessons_2;

public class Bottle {
    String material;
    int volume;
    String manufacturer;
    boolean sticker;

    public static void main(String[] args) {
        Bottle bottleOne = new Bottle();
        bottleOne.material = "Plastik";
        bottleOne.volume = 5;
        bottleOne.manufacturer = "Legenda";
        bottleOne.sticker = true;

        System.out.println(bottleOne.volume + " " + bottleOne.manufacturer + " " +  bottleOne.material + " " +  bottleOne.sticker);

        bottleOne = new Bottle();
        bottleOne.material = "Plastik";

        System.out.println(bottleOne.volume + " " + bottleOne.manufacturer + " " +  bottleOne.material + " " +  bottleOne.sticker);
    }
}
