package op.Lessons_11;

public class Void4 {
    public static void main(String[] args) {

        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
            System.out.println(array[i]);
        }
        middle(array);
    }
    static void middle (double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Среднеарифметическое = " + sum / a.length);
    }
}
