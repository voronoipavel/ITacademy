package op.Lessons_12;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int count5000 = 0;
        int count2000 = 0;
        int count1000 = 0;
        int count500 = 0;
        int count200 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму денег которую вы хотите получить");
        int chislo = scan.nextInt();
        //System.out.println(methodMax(count5000, count2000, count1000, count500, count200));

        if (chislo >= 5000) {
            count5000 = chislo / 5000;
            chislo = chislo % 5000;
        }
        if (5000 < chislo && chislo >= 2000) {
            count2000 = chislo / 2000;
            chislo = chislo % 2000;
        }
        if (2000 < chislo && chislo >= 1000) {
            count1000 = chislo / 1000;
            chislo = chislo % 1000;
        }
        if (1000 < chislo && chislo >= 500) {
            count500 = chislo / 500;
            chislo = chislo % 500;
        }
        if (chislo > 5000) {
            count200 = chislo / 200;
            chislo = chislo % 200;
        }
        System.out.println(chislo);

        System.out.printf("5000 (%d шт) 2000 (%d шт) 1000 (%d шт) 500 (%d шт) 200 (%d шт)", count5000, count2000, count1000, count500, count200);


    }



        static int methodMax (int a, int b, int c, int d, int e){

            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            if (max < d) {
                max = d;
            }
            if (max < e) {
                max = e;
                System.out.println(max);
            }
            return max;
        }


    }

