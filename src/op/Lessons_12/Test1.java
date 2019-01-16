package op.Lessons_12;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму денег которую вы хотите получить");
        int chislo = scan.nextInt();
        int sum5000 = 0;
        int sum2000 = 0;
        int sum1000 = 0;
        int sum500 = 0;
        int sum200 = 0;
        boolean flag = true;
        while (chislo > 0) {
            if (chislo % 5000 == 0) {
                sum5000++;
                chislo = chislo - 5000;
            } else if (chislo % 2000 == 0) {
                sum2000++;
                chislo = chislo - 2000;
            } else if (chislo % 1000 == 0) {
                sum1000++;
                chislo = chislo - 1000;
            } else if (chislo % 500 == 0) {
                sum500++;
                chislo = chislo - 500;
            } else if ((chislo % 200 == 0 || chislo % 200 == 100) && chislo !=100) {
                    sum200++;
                    chislo = chislo - 200;
            } else {
                System.out.println("Вывод не возможен");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("5000 (%d шт) 2000 (%d шт) 1000 (%d шт) 500 (%d шт) 200 (%d шт)",
                    sum5000, sum2000, sum1000, sum500, sum200);
        }
    }
}