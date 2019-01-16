package op.Lessons_2.HomeWork;

import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int year = scan.nextInt();
        boolean age = year < 1995;
        String strCompare;
        if (age) {
            strCompare = "старше";
        }
        else {
            strCompare = "младше";
        }
        System.out.printf("Вы %s меня т.к родились в %d", strCompare, year);
    }
}
