package op.Lessons_5.HomeWork;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, до которого рассчитываются простые числа: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        // перебирать числа по одному
        for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;

            // проверьте, является ли число простым
            for (int j = 2; j * j  <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // выйти из внутреннего цикла
                }
            }

            // напечатать номер, если простое
            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        String s = primes.toString().replace("[", "").replace("]", "");
        System.out.println("Количество простых чисел: " + primes.size() + ", и они: " + s);
    }
}