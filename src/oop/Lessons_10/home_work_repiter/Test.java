package oop.Lessons_10.home_work_repiter;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double value1, value2, value3;
        String isFlag;
        Credit credit[] = new Credit[2];

        for (int i = 0; i < credit.length; i++) {
            System.out.println("Введите сумму " + (i + 1) + "-го кредита: ");
            value1 = Double.parseDouble(reader.readLine());
            System.out.println("Введите годовую процентную ставку " + (i + 1) + "-го  кредита: ");
            value2 = Double.parseDouble(reader.readLine());
            System.out.println("Введите срок " + (i + 1) + "-го кредита в месяцах: ");
            value3 = Double.parseDouble(reader.readLine());
            credit[i] = new Credit(value1, value2, value3);
        }
        System.out.println("Вывести детальную информацию ответьте да или нет");
        isFlag = reader.readLine();
        if (isFlag.equalsIgnoreCase("да")){
            Credit.setIsFlag(true);
        }
        else {
            Credit.setIsFlag(false);
        }

        for (int i = 0; i < credit.length; i++) {
            System.out.println("Информация " + (i + 1) + "-го кредита: ");
            credit[i].calculationOfTheMonthlyPayment();
        }
        System.out.println("Количество кредитов: " + Credit.getId());
    }
}
