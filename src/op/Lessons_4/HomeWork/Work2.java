package op.Lessons_4.HomeWork;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scan.nextInt();
        int tens = value % 10;
        int decimal = value % 100;
        String unitsString, dozensOfString, decimalString, hundredsString;

        switch (value / 100) {
            case 1:
                hundredsString = "сто ";
                break;
            case 2:
                hundredsString = "двести ";
                break;
            case 3:
                hundredsString = "триста ";
                break;
            case 4:
                hundredsString = "четыреста ";
                break;
            case 5:
                hundredsString = "пятьсот ";
                break;
            case 6:
                hundredsString = "шестьсот ";
                break;
            case 7:
                hundredsString = "семьсот ";
                break;
            case 8:
                hundredsString = "восемьсот ";
                break;
            case 9:
                hundredsString = "девятьсот ";
                break;
            default:
                hundredsString = "";
        }
        switch (value % 100 / 10) {
            case 2:
                dozensOfString = "двадцать ";
                break;
            case 3:
                dozensOfString = "тридцать ";
                break;
            case 4:
                dozensOfString = "сорок ";
                break;
            case 5:
                dozensOfString = "пятьдесят ";
                break;
            case 6:
                dozensOfString = "шестьдесят ";
                break;
            case 7:
                dozensOfString = "семьдесят ";
                break;
            case 8:
                dozensOfString = "восемьдесят ";
                break;
            case 9:
                dozensOfString = "девяносто ";
                break;
            default:
                dozensOfString = "";
        }
        System.out.print(hundredsString + dozensOfString);

        if (decimal < 20 && decimal >= 10) {
            switch (value % 100) {
                case 10:
                    decimalString = "десять ";
                    break;
                case 11:
                    decimalString = "одиннадцать ";
                    break;
                case 12:
                    decimalString = "двенадцать ";
                    break;
                case 13:
                    decimalString = "тринадцать ";
                    break;
                case 14:
                    decimalString = "четырнадцать ";
                    break;
                case 15:
                    decimalString = "пятнадцать ";
                    break;
                case 16:
                    decimalString = "шестнадцать ";
                    break;
                case 17:
                    decimalString = "семнадцать ";
                    break;
                case 18:
                    decimalString = "восемнадцать ";
                    break;
                case 19:
                    decimalString = "девятнадцать ";
                    break;
                default:
                    decimalString = "";
            }
            System.out.print(decimalString);
        } else {
            switch (tens) {
                case 1:
                    unitsString = "один ";
                    break;
                case 2:
                    unitsString = "два ";
                    break;
                case 3:
                    unitsString = "три ";
                    break;
                case 4:
                    unitsString = "четыре ";
                    break;
                case 5:
                    unitsString = "пять ";
                    break;
                case 6:
                    unitsString = "шесть ";
                    break;
                case 7:
                    unitsString = "семь ";
                    break;
                case 8:
                    unitsString = "восемь ";
                    break;
                case 9:
                    unitsString = "девять ";
                    break;
                default:
                    unitsString = "";
            }
            System.out.print(unitsString);
        }
    }
}
