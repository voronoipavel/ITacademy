package oop.lessons_8.library;

public class Book {
    private String title;
    private String author;
    private int pages;
    protected String present;
    private String cipher;
    boolean needOfRepair;

    public Book(String title, String author, String cipher) {
        this.title = title;
        this.author = author;
        this.cipher = cipher;
        //this.cipher = String.valueOf(this.hashCode());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", cipher='" + cipher + '\'' +
                '}';
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title, String cipher) {
        this.title = title;
        this.cipher = cipher;
    }

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author, String cipher) {
        this.author = author;
        this.cipher = cipher;
    }

    private int getPages() {
        return pages;
    }

    private void setPages(int pages) {
        this.pages = pages;
    }

    private String getCipher() {
        return cipher;
    }

    private void setCipher(String cipher) {
        this.cipher = cipher;
    }
    public  void correctChangOfBook(String title, String author, int pages, String cipher){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.cipher = cipher;

    }
}
