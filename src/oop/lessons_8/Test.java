package oop.lessons_8;

import oop.lessons_8.library.Book;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", "1");
        book1.correctChangOfBook("Л. Толстой", "2",250,"145");
        System.out.println(book1);
    }
}
