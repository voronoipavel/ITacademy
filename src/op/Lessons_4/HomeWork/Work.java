package op.Lessons_4.HomeWork;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ваша зарплата ");
        double zp = scan.nextDouble();
        System.out.println("Стаж");
        int staj = scan.nextInt();
        System.out.println("план");
        boolean plan = scan.nextBoolean();

        double resault = 0;

        if (staj >= 3) {
            resault = zp * 0.06;
        }
        if (plan || zp < 5000) {
            zp = zp * 0.10;
        }
        if (plan || zp > 5000 || zp < 10000) {
            zp = zp * 0.05;
        }
        if (plan || zp > 10000) {
            zp = zp * 0.02;
        }
        System.out.println("Ваша зп " + (zp + resault));
        System.out.println("Ваша зп после налогов " + (zp + resault)/1.02);
    }
}