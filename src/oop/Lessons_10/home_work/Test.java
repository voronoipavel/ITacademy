package oop.Lessons_10.home_work;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double value;
        Credit credit[] = new Credit[5];

        for (int i = 0; i < credit.length; i++) {
            System.out.println("Введите сумму " + (i + 1) + "-го кредита: ");
            value = Double.parseDouble(reader.readLine());
            credit[i].setCreditAmount(value);
            System.out.println("Введите годовую процентную ставку " + (i + 1) + "-го  кредита: ");
            value = Double.parseDouble(reader.readLine());
            credit[i].setInterestRate(value);
            System.out.println("Введите срок" + (i + 1) + "-го кредита в месяцах: ");
            value = Double.parseDouble(reader.readLine());
            credit[i].setLoanTermInMonths(value);

            System.out.println("Детальная информация: ");
            credit[i].calculationOfTheMonthlyPayment();
        }
    }
}
