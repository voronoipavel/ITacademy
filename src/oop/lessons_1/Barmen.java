package oop.lessons_1;

public class Barmen {
    public static void main(String[] args) {
        System.out.println(spisok("пиво"));
        System.out.println(spisok("вино"));
        System.out.println(spisok("водка"));
    }

    static String spisok(String nazvanie) {
        char zap=' ';
        String[] spvin = {"Toro", "CherryMarry", "Chardonnay"};
        String[] spvodok = {"Beluga", "Кыргыз Арагы", "Финляндия"};
        String[] sppiva = {"9", "Arpa", "Живое"};
        String ppp="";
        for (int i = 0; i < 3; i++) {
            if (nazvanie.equalsIgnoreCase("Вино")) {
                ppp+=spvin[i]+zap;
            }
            if (nazvanie.equalsIgnoreCase("Водка")) {
                ppp+=spvodok[i]+zap;
            }
            if (nazvanie.equalsIgnoreCase("Пиво")) {
                ppp+=sppiva[i]+zap;
            }
        }
        return ppp;
    }
}