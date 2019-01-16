package op.Lessons_12;

public class Test2 {
    public static void main(String[] args) {
        int sum3 = 0, sum4 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0){
                sum3 = i + sum3;
            }
            if (i % 4 == 0){
                sum4 = i + sum4;
            }
        }
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum3-sum4);
    }
}
