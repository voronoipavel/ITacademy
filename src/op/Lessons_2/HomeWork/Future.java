package op.Lessons_2.HomeWork;

import java.util.Scanner;

public class Future {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Внесите год рождения");
        int year = scan.nextInt();//Если ставлю int не могу дальше считать всю строку, только слово не понимаю почему???
        System.out.println("Внесите имя");
        String name = scan.next();
        System.out.println("С какой целью вы посещаете курсы?");
        String intent = scan.next();
        System.out.println("Успеваете делать домашку? true = да, false = нет");
        boolean homeWork = scan.nextBoolean();
        System.out.println("Внесите ваш пол \"мужской \"или\" женский\"");  // Это я показал как вывести ""
        String gender = scan.next();
        String respect, born, strCompare1, strCompare2;

        if (gender.equals("мужской") || gender.equals("Мужской")) {
            respect = "Уважаемый";
            born = "рожденный";
        } else {
            respect = "Уважаемоя";
            born = "рожденная";
        }
        if (homeWork) {
            strCompare1 = "успеваете";
            strCompare2 = "достигнете";
        } else {
            strCompare1 = "не успеваете";
            strCompare2 = "не достигнете";
        }
        System.out.printf("%s %s %s в %s вы %s сделать домашнее задание. Так, вы %s указанной вами цели %s",
                respect, name, born, year, strCompare1, strCompare2, intent);
    }
}