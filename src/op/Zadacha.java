package op;

public class Zadacha {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        while (true) {
            int a = 1 + (int) (Math.random() * 40);
            int b = 1 + (int) (Math.random() * 40);
            int c = 1 + (int) (Math.random() * 40);
            int d = 1 + (int) (Math.random() * 40);
            //System.out.println(a + " " + b + " " + c + " " + d);

            if (a + c + d + a + c + d + a + c + d == 120 && b + c + d == 30 && d + b + b + a + b == 65 && a + c + d + b + d == 56) {

                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                System.out.println("d = " + d);
                System.out.println(b + c + a + b + d + b + c + c);
                break;
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения программы в секундах = " + (timeSpent / 1000) + " в милисекундах = " + timeSpent);
    }
}

