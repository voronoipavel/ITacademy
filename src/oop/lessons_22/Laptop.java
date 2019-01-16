package oop.lessons_22;

public class Laptop extends LapCom {
    public Laptop(int price, LapComModel model) {
        super(price, model);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
