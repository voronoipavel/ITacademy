package op.Lessons_11;

public class javaVoid {
    public static void main(String[] args) {
        double a1 = 12.09, b1 = 8.7;
        System.out.println((a1 * b1) / (a1 + b1));
        methodTest(a1, b1);
        methodTest(23);
        methodTest(23, 25);
    }
    static void methodTest(double a, double b) {
        double result;
        result = a * b / (a + b);
        System.out.println(result);
    }
    static void methodTest(double a) {
        double result;
        result = a * a / (a + a);
        System.out.println(result);
    }
}
