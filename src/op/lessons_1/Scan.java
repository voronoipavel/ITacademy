package op.lessons_1;

import java.util.Scanner; // импорт сканера

public class Scan {
    public static void main(String args[]){
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);
    }
}