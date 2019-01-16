package oop.lessons_22;

public class Computer extends LapCom {
    double width;

    @Override
    public String toString() {
        return "Computer{" +
                "width=" + width +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public Computer(int price, LapComModel model, double width) {
        super(price, model);
        this.width = width;


    }
}
