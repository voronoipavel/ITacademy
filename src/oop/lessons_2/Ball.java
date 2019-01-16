package oop.lessons_2;

public class Ball {
    String color;
    double price;
    double radius;
    String producerCountry;

    public static void main(String[] args) {
        Ball ballOne = new Ball();
        ballOne.color = "Red";
        ballOne.price = 10;
        ballOne.radius = 10.8;
        ballOne.producerCountry = "Brazill";
        System.out.println(ballOne.color + ballOne);
    }
}
