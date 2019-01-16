package op.Lessons_3;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        //boolean isFree = day == 6 | day == 7;
        boolean isHomeWork = day == 4 | day == 6;
        boolean isWorkDay = day == 1 | day == 2 | day == 3 | day == 4 | day == 5;
        boolean isFishDay = day == 4;
        if (day == 6 | day == 7) {
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
    }
}

