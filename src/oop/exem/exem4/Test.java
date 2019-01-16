package oop.exem.exem4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();


        Book book1 = new Book(1987,500);
        Book book2 = new Book(1984,200);
        Book book3 = new Book(1985,300);
        Book book4 = new Book(1986,700);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book4);
        System.out.println(book1.sale(books));

    }
}
