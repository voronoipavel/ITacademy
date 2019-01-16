package oop.lessons_7;

public class Table {
    double price;

    public Table(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Цена = " + price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
