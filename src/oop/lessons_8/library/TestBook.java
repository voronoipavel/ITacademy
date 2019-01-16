package oop.lessons_8.library;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", "1");
        book1.correctChangOfBook("Л. Толстой", "2",250,"145");

        book1.present = "jj";


        System.out.println(book1);
    }
}
