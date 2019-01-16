package op;

public class Zadacha1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int x = 1;
        int y = 40;
        boolean isFlag = true;

        for (int a = x; isFlag && a < y; a++) {
            for (int b = x; isFlag && b < y; b++) {
                for (int c = x; isFlag && c < y; c++) {
                    for (int d = x; isFlag && d < y; d++) {
                        //System.out.println(a + " " + b + " " + c + " " + d);
                        if (a + c + d + a + c + d + a + c + d == 120 && b + c + d == 30 && d + b + b + a + b == 65 && a + c + d + b + d == 56) {
                            System.out.println("a = " + a);
                            System.out.println("b = " + b);
                            System.out.println("c = " + c);
                            System.out.println("d = " + d);
                            System.out.println(b + c + a + b + d + b + c + c);
                            isFlag = false;
                        }
                    }
                }
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения программы в секундах = " + (timeSpent / 1000) + " в милисекундах = " + timeSpent);
    }
}

