package op.Lessons_2;

import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию");
        String lastName = scan.nextLine();
        System.out.println("Введите имя");
        String firstName = scan.nextLine();
        System.out.println("Введите год рождения");
        int year = scan.nextInt();
        System.out.println("Социальный статус(True, False)");
        boolean status = scan.nextBoolean();
        System.out.printf("Фамилия %s, Имя %s г.р. %d статус в браке %s", lastName, firstName, year, status);
    }
}
