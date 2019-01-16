package oop.lessons_22.classWork;

public class Test {
    public static void main(String[] args) {
        String inpDay = "mon";
        Days day = Days.valueOf(inpDay) ;

        switch (day){
            case MON:
            case WED:
            case FRI:
                System.out.println("Я учусь"); break;
                default:
                    System.out.println("Я свободен");
        }
    }
}
