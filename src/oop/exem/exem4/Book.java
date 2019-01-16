package oop.exem.exem4;

import java.util.ArrayList;

public class Book {
    String id;
    int yearOfIssue;
    int price;

    public Book(int yearOfIssue, int price) {
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        getId(yearOfIssue);
    }

    public String getId(int yearOfIssue) {
        return this.id = "БИ" + yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int sale(ArrayList<Book> arrayList) {
        int min = arrayList.get(0).getYearOfIssue();
        int minPrice = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getYearOfIssue() < min) {
            min = arrayList.get(i).getYearOfIssue();
                minPrice = arrayList.get(i).getPrice() / 2;
            }
        }
        return minPrice;
    }
}

