package op.Lessons_12;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год рождения ");

        int age = scan.nextInt();
        int god = 2018;

        System.out.println("Человеку " + (god - age) + " лет");
        if (age % 100 == 0) {
            if (age % 400 == 0) {
                System.out.println("Высокосный");
            } else {
                System.out.println("Не высокосный");
            }
        } else if (age % 4 == 0) {
            System.out.println("Высокосный");
        } else {
            System.out.println("Не высокосный");
        }
    }
}
