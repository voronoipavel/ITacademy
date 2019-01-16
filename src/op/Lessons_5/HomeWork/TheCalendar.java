package op.Lessons_5.HomeWork;

import java.util.Scanner;

public class TheCalendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите с какого числа начинается месяц ");
        int count;
        int day;
        int sum;
        String text = "";

        while (true) {
            count = scan.nextInt();
            if (count >= 28 && count <= 31) {
                break;
            }
            if (count < 28) {
                System.out.println("В месяце не может быть меньше 28 дней");
            }
            if (count > 31) {
                System.out.println("В месяце не может быть больше 31 ддня");
            }
        }

        System.out.println("Введите день недели с которого начинается меся (1-7)");

        while (true) {
            day = scan.nextInt();
            if (day >= 1 && day <= 7) {
                break;
            } else {
                System.out.println("Введите число от 1 до 7");
            }
        }

        for (int i = 1; i <= count; i ++) {
            sum = i % 10 + i / 10;
            if (day == 8) {
                day /= 8;
            }
            switch (day) {
                case 1:
                    text = "пн";
                    break;
                case 2:
                    text = "вт";
                    break;
                case 3:
                    text = "ср";
                    break;
                case 4:
                    text = "чт";
                    break;
                case 5:
                    text = "пт";
                    break;
                case 6:
                    text = "сб";
                    break;
                case 7:
                    text = "вс";
                    break;
            }
            System.out.print(i + " - " + text);
            day ++;
            if (sum >= 9) {
                System.out.println(" (здорово!)");
            }
            else {
                System.out.println();
            }
        }
    }
}
