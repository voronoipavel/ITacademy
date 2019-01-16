package oop.lessons_13.task_14;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Fiction fiction = new Fiction(132,"Война и Мир", "Толстой", LocalDate.of(1968,5,10));
        Legal legal = new Legal(15,"Юридическая книга", "Какой-то автор", LocalDate.of(2001,12,25));
        Technical technical = new Technical(55,"Война и Мир", "Автор", LocalDate.of(1980,5,15));
        System.out.println(fiction.searchByAuthor("толстой"));
        System.out.println(legal.searchByAuthor("толстой"));
        System.out.println(technical.searchByAuthor("толстой"));
        System.out.println("Кол-во книг в библиотеке " + Fiction.count);
        System.out.println("Кол-во книг в библиотеке " + Legal.count);
        System.out.println("Кол-во книг в библиотеке " + Technical.count);
    }
}
