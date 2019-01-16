package op.lessons_1.home_work;

import java.util.Scanner;

public class NumericalValue_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Введите число!");
            while (!sc.hasNextByte()) {
                System.out.println("Число  слишком большое для байта. Попробуйте снова.");
                sc.next(); // this is important!
                if (number > 50 & number < 100){
                    System.out.println("Вы удачно попали. Выбранное вами число = " + number * 2);
                }
            }
            number = sc.nextInt();
        } while (!sc.hasNextInt());
        System.out.println("Спасибо ваше мнение очень важно для нас.");
    }
}