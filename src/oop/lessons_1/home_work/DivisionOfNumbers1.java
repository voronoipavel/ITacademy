package oop.lessons_1.home_work;

public class DivisionOfNumbers1 {
    public static void main(String[] args) {
        int sumByThree = 0, sumByFour = 0;
        for (int i = 1; i <= 100; i++) {
            if (divisionCheck(i, i)) {
                sumByThree += i;
            }
            if (divisionCheck(i,i)) {
                sumByFour += i;
            }
        }
        informationOutputMethod(sumByThree);
        informationOutputMethod(sumByFour);
        informationOutputMethod((sumByFour + sumByThree));
    }
    static boolean  divisionCheck (int value, int divisor) {
        boolean isOk = false;
        if (value % 3 == 0) {
            isOk = true;
        }
        if (divisor % 4 == 0) {
            isOk = true;
        }
        return isOk;
    }
    static void informationOutputMethod (int resault){
        System.out.println(resault);
    }
}