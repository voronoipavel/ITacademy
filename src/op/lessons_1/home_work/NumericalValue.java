package op.lessons_1.home_work;

import java.util.Scanner;

public class NumericalValue {
    public static void main(String[] args) {
        System.out.println("Введите любое число ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        number = number * 2;
        boolean result  = (number >= 50 & number <= 100);
        if (result) {
            System.out.println("Вы \"удачно\" попали. Выбранное вами число = " + number);
        }
        else if (number > 127){
            System.out.println("Число " + number + " слишком большое для байта. Попробуйте снова.");
        }
        else {
            System.out.println("Спасибо ваше мнение очень важно для нас.");
        }
    }
}