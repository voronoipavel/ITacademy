package oop.lessons_6.massiv;

public class Massiv {
    public static void main(String[] args) {
        int iAr[] = new int[10];
        iAr[5] = new Integer(25);

        int iBr[] = iAr;
        System.out.println(iBr[5]);
    }
}
