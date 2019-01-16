package op.Lessons_4.HomeWork;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scan.nextInt();

        int hundredsOfThousands1 = value / 100000;
        int hundredsOfThousands = value / 10000 % 10;
        int tensOfThousands = value / 1000 % 10;
        int decimalThousands = value / 1000;
        int hundreds = value / 100 % 10;
        int dozensOf = value % 100 / 10;
        int tens = value % 10;
        int decimal = value % 100;

        String unitsString, dozensOfString, decimalString, hundredsString;
        String tensOfThousandsString, decimalThousandsString, dozensOfHundredsString;

        System.out.println(hundredsOfThousands1);
        System.out.println(hundredsOfThousands);
        System.out.println(tensOfThousands);
        System.out.println(decimalThousands);
        System.out.println(hundreds);
        System.out.println(dozensOf);
        System.out.println(tens);

        switch (value / 100000) {
            case 1:          hundredsString = "сто ";         break;
            case 2:          hundredsString = "двести ";      break;
            case 3:          hundredsString = "триста ";      break;
            case 4:          hundredsString = "четыреста ";   break;
            case 5:          hundredsString = "пятьсот ";     break;
            case 6:          hundredsString = "шестьсот ";    break;
            case 7:          hundredsString = "семьсот ";     break;
            case 8:          hundredsString = "восемьсот ";   break;
            case 9:          hundredsString = "девятьсот ";   break;
            default:         hundredsString = "";
        }
        System.out.print(hundredsString);

        switch (value / 10000 % 10) {
            case 2:          dozensOfHundredsString = "двадцать ";      break;
            case 3:          dozensOfHundredsString = "тридцать ";      break;
            case 4:          dozensOfHundredsString = "сорок ";         break;
            case 5:          dozensOfHundredsString = "пятьдесят ";     break;
            case 6:          dozensOfHundredsString = "шестьдесят ";    break;
            case 7:          dozensOfHundredsString = "семьдесят ";     break;
            case 8:          dozensOfHundredsString = "восемьдесят ";   break;
            case 9:          dozensOfHundredsString = "девяносто ";     break;
            default:         dozensOfHundredsString = "";
        }
        System.out.print(dozensOfHundredsString);

        if (decimalThousands < 20 && decimalThousands >= 10) {
            switch (value / 1000) {
                case 10:     decimalThousandsString = "десять тысяч ";       break;
                case 11:     decimalThousandsString = "одиннадцать тысяч ";  break;
                case 12:     decimalThousandsString = "двенадцать тысяч ";   break;
                case 13:     decimalThousandsString = "тринадцать тысяч ";   break;
                case 14:     decimalThousandsString = "четырнадцать тысяч "; break;
                case 15:     decimalThousandsString = "пятнадцать тысяч ";   break;
                case 16:     decimalThousandsString = "шестнадцать тысяч ";  break;
                case 17:     decimalThousandsString = "семнадцать тысяч ";   break;
                case 18:     decimalThousandsString = "восемнадцать тысяч "; break;
                case 19:     decimalThousandsString = "девятнадцать тысяч "; break;
                default:     decimalThousandsString = "";
            }
            System.out.print(decimalThousandsString);
        } else {
            switch (value / 1000 % 10) {
                case 1:      tensOfThousandsString = "одна тысяча ";     break;
                case 2:      tensOfThousandsString = "две тысячи ";      break;
                case 3:      tensOfThousandsString = "три тысячи ";      break;
                case 4:      tensOfThousandsString = "четыре тысячи ";   break;
                case 5:      tensOfThousandsString = "пять тысяч ";      break;
                case 6:      tensOfThousandsString = "шесть тысяч ";     break;
                case 7:      tensOfThousandsString = "семь тысяч ";      break;
                case 8:      tensOfThousandsString = "восемь тысяч ";    break;
                case 9:      tensOfThousandsString = "девять тысяч ";    break;
                default:     tensOfThousandsString = "";
            }
            System.out.print(tensOfThousandsString);
        }
        switch (value / 100 % 10) {
            case 1:          hundredsString = "сто ";         break;
            case 2:          hundredsString = "двести ";      break;
            case 3:          hundredsString = "триста ";      break;
            case 4:          hundredsString = "четыреста ";   break;
            case 5:          hundredsString = "пятьсот ";     break;
            case 6:          hundredsString = "шестьсот ";    break;
            case 7:          hundredsString = "семьсот ";     break;
            case 8:          hundredsString = "восемьсот ";   break;
            case 9:          hundredsString = "девятьсот ";   break;
            default:         hundredsString = "";
        }
        System.out.print(hundredsString);

        switch (value % 100 / 10) {
            case 2:          dozensOfString = "двадцать ";     break;
            case 3:          dozensOfString = "тридцать ";     break;
            case 4:          dozensOfString = "сорок ";        break;
            case 5:          dozensOfString = "пятьдесят ";    break;
            case 6:          dozensOfString = "шестьдесят ";   break;
            case 7:          dozensOfString = "семьдесят ";    break;
            case 8:          dozensOfString = "восемьдесят ";  break;
            case 9:          dozensOfString = "девяносто ";    break;
            default:         dozensOfString = "";
        }
        System.out.print(dozensOfString);
        if (decimal < 20 && decimal >= 10) {
            switch (value % 100) {
                case 10:     decimalString = "десять ";       break;
                case 11:     decimalString = "одиннадцать ";  break;
                case 12:     decimalString = "двенадцать ";   break;
                case 13:     decimalString = "тринадцать ";   break;
                case 14:     decimalString = "четырнадцать "; break;
                case 15:     decimalString = "пятнадцать ";   break;
                case 16:     decimalString = "шестнадцать ";  break;
                case 17:     decimalString = "семнадцать ";   break;
                case 18:     decimalString = "восемнадцать "; break;
                case 19:     decimalString = "девятнадцать "; break;
                default:     decimalString = "";
            }
            System.out.print(decimalString);
        } else {
            switch (tens) {
                case 1:      unitsString = "один ";    break;
                case 2:      unitsString = "два ";     break;
                case 3:      unitsString = "три ";     break;
                case 4:      unitsString = "четыре ";  break;
                case 5:      unitsString = "пять ";    break;
                case 6:      unitsString = "шесть ";   break;
                case 7:      unitsString = "семь ";    break;
                case 8:      unitsString = "восемь ";  break;
                case 9:      unitsString = "девять ";  break;
                default:     unitsString = "";
            }
            System.out.print(unitsString);
        }
    }
}
