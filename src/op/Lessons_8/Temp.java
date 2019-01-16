package op.Lessons_8;
import java.util.Random;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rgen = new Random();
        System.out.println("Vvedite n");
        int n = scanner.nextInt();
        System.out.println("Vvedite y");
        int y = scanner.nextInt();
        int arr[] = new int[n];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rgen.nextInt(100);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == y)
                k++;
        }
        if (k > 0)
            System.out.println("Ok");
        else
            System.out.println("Error");
    }
}