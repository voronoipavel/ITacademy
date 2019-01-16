package op.Lessons_3.HomeWork;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 2; i >= 0; i--) {
            System.out.println("Введите день недели 1-7 или Пн-Вс");
            String day = scan.next();
            boolean isFree = day.equals("6") | day.equals("7")
                    | day.equalsIgnoreCase("сб") | day.equalsIgnoreCase("вс");
            boolean isHomeWork = day.equals("4") | day.equals("6");
            boolean isWorkDay = day.equals("1") | day.equals("2") | day.equals("3") | day.equals("4") | day.equals("5")
                    | day.equalsIgnoreCase("пн") | day.equalsIgnoreCase("вт")
                    | day.equalsIgnoreCase("ср") | day.equalsIgnoreCase("чт")
                    | day.equalsIgnoreCase("пт");
            boolean isFishDay = day.equals("4") | day.equalsIgnoreCase("чт");
            if (isFree | isFishDay | isHomeWork | isWorkDay) {
                if (isFree) {
                    System.out.println("Выходной");
                }
                if (isFishDay) {
                    System.out.println("Это рыбный день");
                }
                if (isHomeWork) {
                    System.out.println("Нужно сделать домашку");
                }
                if (isWorkDay) {
                    System.out.println("Рабочий день");
                }
                break;
            }
            System.out.println("Ввод не корректен у Вас осталось попыток: " + i);
        }
    }
}
