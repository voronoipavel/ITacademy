package oop.lessons_1.home_work;

public class DivisionOfNumbers {
    public static void main(String[] args) {
        int sumByThree = 0, sumByFour = 0;
        for (int i = 1; i <= 100; i++) {
            if (divisionIntoThree(i)) {
                sumByThree += i;
            }
            if (divisionIntoFour(i)) {
                sumByFour += i;
            }
        }
        informationOutputMethod(sumByThree);
        informationOutputMethod(sumByFour);
        informationOutputMethod(sumByFour + sumByThree);
    }
    static boolean divisionIntoThree(int value) {
        boolean isOk = false;
        if (value % 3 == 0) {
            isOk = true;
        }
        return isOk;
    }
    static boolean divisionIntoFour(int value) {
        boolean isOk = false;
        if (value % 4 == 0) {
            isOk = true;
        }
        return isOk;
    }
    static void informationOutputMethod (int resault){
        System.out.println(resault);
    }
}