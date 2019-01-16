package oop.lessons_15.student;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        student[] stu = new student[4];
        stu[0] = new student(1, "Abdiev", "Salamat", "Rustembayevich", new Date(1990, 9, 9), "sergeli-7", 6667606, "Ekonomicheskiy", 3, "AT-12");
        stu[1] = new student(2, "Abdullaye", "Abduhakim", "Abdurashidovich", new Date(1991, 5, 6), "mirobod", 9277606, "OPiU", 4, "AB-177");
        stu[2] = new student(3, "Lapasov", "Furqat", "Gaybullayevich", new Date(1992, 6, 19), "chuqursoy", 7277190, "Ekonomicheskiy", 2, "AT-12");
        stu[3] = new student(4, "Ermatov", "Anvar", "Abdumalikovich", new Date(1988, 11, 19), "chuqursoy", 6667190, "Mexanika", 3, "MF-162");

        Date p=new Date(1990, 9, 9);

        for (int i = 0; i <= 3; i++) {
            stu[i].show();
        }
//вывод на екран
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakultet();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakkurs();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].date_roj(p);
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].groupp();
        }


        // TODO code application logic here


    }
}
