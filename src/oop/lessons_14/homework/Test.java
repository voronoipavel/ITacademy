package oop.lessons_14.homework;

public class Test {
    public static void main(String[] args) {

        InhabitedLocality[] inhabitedLocality = new InhabitedLocality[5];

        inhabitedLocality[0] = new City("Албек Ибраимов", "Бишкек", "Чуйская");
        inhabitedLocality[1] = new City("Адыл Каниметов", "Каракол", "Иссык-Кульская");
        City city3 = new City("Таалайбек Сарыбашев", "Ош", "Ошская");
        inhabitedLocality[2] = city3;

        inhabitedLocality[3] = new Village("Мамыркулова", "Ананьево");
        inhabitedLocality[4] = new Village("Саралаев", "Ивановка");

        for (int i = 0; i < inhabitedLocality.length; i++) {

            inhabitedLocality[i].search("Саралаев");
        }
    }
}
