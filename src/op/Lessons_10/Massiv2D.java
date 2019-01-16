package op.Lessons_10;


import java.util.Scanner;

public class Massiv2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int value = 1, sum = 0;
        int k1 = 3;
        int k2 = 100;

        int massiv[] = new int[index];
        for (int i = 0; i < massiv.length; i++) {
            if (i % 3 == 0) {
                massiv[i] = value++;
            }
            else {
                value++;
            }
            if (i >= k1 && i <= k2)
            sum += massiv[i];
        }
        for (int i : massiv) {
            System.out.println(i);
        }
        System.out.println("Summa " + sum);
    }
}
