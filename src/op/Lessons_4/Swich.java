package op.Lessons_4;

public class Swich {
    public static void main(String args[]) {
        double n = 111.11;
        int temp = (int) (n * 100), sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}