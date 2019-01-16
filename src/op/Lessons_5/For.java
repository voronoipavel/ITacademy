package op.Lessons_5;

public class For {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 30; i > 0; i -= 2) {
            System.out.print(i +",");
            sum = sum + i;

        }
        System.out.println();
        System.out.println(sum);
        if (sum % 3 == 0){
            System.out.println(sum / 3);
        }
        else {
            System.out.println("Сумма не делится на 3");
        }

    }
}
